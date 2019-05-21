package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Visit website options
  *
  * @see https://on.cypress.io/visit
  */
trait VisitOptions
  extends Loggable
     with Timeoutable
     with Failable {
  /**
    * Cypress will automatically apply the right authorization headers
    * if you’re attempting to visit an application that requires
    * Basic Authentication.
    *
    * @example
    *    cy.visit('https://www.acme.com/', {
    *      auth: {
    *        username: 'wile',
    *        password: 'coyote'
    *      }
    *    })
    */
  var auth: Auth
  /**
    * An optional body to send along with a `POST` request. If it is a string, it will be passed along unmodified. If it is an object, it will be URL encoded to a string and sent with a `Content-Type: application/x-www-urlencoded` header.
    *
    * @example
    *    cy.visit({
    *      url: 'http://www.example.com/form.html',
    *      method: 'POST',
    *      body: {
    *        "field1": "foo",
    *        "field2": "bar"
    *      }
    *    })
    */
  var body: RequestBody
  /**
    * An object that maps HTTP header names to values to be sent along with the request.
    *
    * @example
    *    cy.visit({
    *      url: 'http://www.example.com',
    *      headers: {
    *        'Accept-Language': 'en-US'
    *      }
    *    })
    */
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The HTTP method to use in the visit. Can be `GET` or `POST`.
    *
    * @default "GET"
    */
  var method: cypressLib.cypressLibStrings.GET | cypressLib.cypressLibStrings.POST
  /**
    * The URL to visit. Behaves the same as the `url` argument.
    */
  var url: java.lang.String
  /**
    * Called before your page has loaded all of its resources.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onBeforeLoad(win: stdLib.Window): scala.Unit
  /**
    * Called once your page has fired its load event.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onLoad(win: stdLib.Window): scala.Unit
}

object VisitOptions {
  @scala.inline
  def apply(
    auth: Auth,
    body: RequestBody,
    failOnStatusCode: scala.Boolean,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    log: scala.Boolean,
    method: cypressLib.cypressLibStrings.GET | cypressLib.cypressLibStrings.POST,
    onBeforeLoad: stdLib.Window => scala.Unit,
    onLoad: stdLib.Window => scala.Unit,
    retryOnNetworkFailure: scala.Boolean,
    retryOnStatusCodeFailure: scala.Boolean,
    timeout: scala.Double,
    url: java.lang.String
  ): VisitOptions = {
    val __obj = js.Dynamic.literal(auth = auth, body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode, headers = headers, log = log, method = method.asInstanceOf[js.Any], onBeforeLoad = js.Any.fromFunction1(onBeforeLoad), onLoad = js.Any.fromFunction1(onLoad), retryOnNetworkFailure = retryOnNetworkFailure, retryOnStatusCodeFailure = retryOnStatusCodeFailure, timeout = timeout, url = url)
  
    __obj.asInstanceOf[VisitOptions]
  }
}

