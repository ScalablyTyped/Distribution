package typings.cypress.typesNetStubbingMod

import typings.cypress.cypressStrings.afterColonresponse
import typings.cypress.cypressStrings.beforeColonresponse
import typings.cypress.cypressStrings.response
import typings.cypress.typesNetStubbingMod.CyHttpMessages.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestEvents extends StObject {
  
  /**
    * Emitted once the response to a request has finished sending to the browser.
    * Modifications to `res` have no impact.
    * If a promise is returned from `cb`, it will be awaited before processing other event handlers.
    */
  @JSName("on")
  def on_afterresponse(
    eventName: afterColonresponse,
    cb: js.Function1[/* res */ IncomingResponse, Unit | js.Promise[Unit]]
  ): this.type = js.native
  /**
    * Emitted before `response` and before any `req.continue` handlers.
    * Modifications to `res` will be applied to the incoming response.
    * If a promise is returned from `cb`, it will be awaited before processing other event handlers.
    */
  @JSName("on")
  def on_beforeresponse(eventName: beforeColonresponse, cb: HttpResponseInterceptor): this.type = js.native
  /**
    * Emitted after `before:response` and after any `req.continue` handlers - before the response is sent to the browser.
    * Modifications to `res` will be applied to the incoming response.
    * If a promise is returned from `cb`, it will be awaited before processing other event handlers.
    */
  @JSName("on")
  def on_response(eventName: response, cb: HttpResponseInterceptor): this.type = js.native
}
