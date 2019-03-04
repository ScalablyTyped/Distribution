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
     with Timeoutable {
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
    * Whether to fail on response codes other than 2xx and 3xx
    *
    * @default {true}
    */
  var failOnStatusCode: scala.Boolean
  /**
    * Called before your page has loaded all of its resources.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onBeforeLoad(win: mochaLib.Window): scala.Unit
  /**
    * Called once your page has fired its load event.
    *
    * @param {Window} contentWindow the remote page's window object
    */
  def onLoad(win: mochaLib.Window): scala.Unit
}

object VisitOptions {
  @scala.inline
  def apply(
    auth: Auth,
    failOnStatusCode: scala.Boolean,
    log: scala.Boolean,
    onBeforeLoad: js.Function1[mochaLib.Window, scala.Unit],
    onLoad: js.Function1[mochaLib.Window, scala.Unit],
    timeout: scala.Double
  ): VisitOptions = {
    val __obj = js.Dynamic.literal(auth = auth, failOnStatusCode = failOnStatusCode, log = log, onBeforeLoad = onBeforeLoad, onLoad = onLoad, timeout = timeout)
  
    __obj.asInstanceOf[VisitOptions]
  }
}

