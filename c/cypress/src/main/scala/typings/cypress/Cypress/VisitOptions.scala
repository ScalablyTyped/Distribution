package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.cypressStrings.GET
import typings.cypress.cypressStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Visit website options
  *
  * @see https://on.cypress.io/visit
  */
trait VisitOptions
  extends StObject
     with Loggable
     with Timeoutable
     with Failable {
  
  /**
    * Cypress will automatically apply the right authorization headers
    * if you're attempting to visit an application that requires
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
  var headers: StringDictionary[String]
  
  /**
    * The HTTP method to use in the visit. Can be `GET` or `POST`.
    *
    * @default "GET"
    */
  var method: GET | POST
  
  /**
    * Called before your page has loaded all of its resources.
    *
    * @param {AUTWindow} contentWindow the remote page's window object
    */
  def onBeforeLoad(win: AUTWindow): Unit
  
  /**
    * Called once your page has fired its load event.
    *
    * @param {AUTWindow} contentWindow the remote page's window object
    */
  def onLoad(win: AUTWindow): Unit
  
  /**
    * Query parameters to append to the `url` of the request.
    */
  var qs: js.Object
  
  /**
    * The URL to visit. Behaves the same as the `url` argument.
    */
  var url: String
}
object VisitOptions {
  
  inline def apply(
    auth: Auth,
    body: RequestBody,
    failOnStatusCode: Boolean,
    headers: StringDictionary[String],
    log: Boolean,
    method: GET | POST,
    onBeforeLoad: AUTWindow => Unit,
    onLoad: AUTWindow => Unit,
    qs: js.Object,
    retryOnNetworkFailure: Boolean,
    retryOnStatusCodeFailure: Boolean,
    timeout: Double,
    url: String
  ): VisitOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onBeforeLoad = js.Any.fromFunction1(onBeforeLoad), onLoad = js.Any.fromFunction1(onLoad), qs = qs.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisitOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeLoad(value: AUTWindow => Unit): Self = StObject.set(x, "onBeforeLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoad(value: AUTWindow => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
