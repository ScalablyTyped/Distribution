package typings.cypress.typesNetStubbingMod

import typings.cypress.anon.Handler
import typings.cypress.cypressStrings.reqModified
import typings.cypress.cypressStrings.resModified
import typings.cypress.cypressStrings.spied
import typings.cypress.cypressStrings.stubbed
import typings.cypress.typesNetStubbingMod.CyHttpMessages.IncomingRequest
import typings.cypress.typesNetStubbingMod.CyHttpMessages.IncomingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interception extends StObject {
  
  /* @internal */
  var browserRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The error that occurred during this request.
    */
  var error: js.UndefOr[js.Error] = js.undefined
  
  var id: String
  
  var request: IncomingRequest
  
  /**
    * Was `cy.wait()` used to wait on this request?
    * @internal
    */
  var requestWaited: Boolean
  
  var response: js.UndefOr[IncomingResponse] = js.undefined
  
  /**
    * Was `cy.wait()` used to wait on the response to this request?
    * @internal
    */
  var responseWaited: Boolean
  
  var routeId: String
  
  /* @internal */
  def setLogFlag(flag: spied | stubbed | reqModified | resModified): Unit
  
  /* @internal */
  var state: InterceptionState
  
  /* @internal */
  var subscriptions: js.Array[Handler]
}
object Interception {
  
  inline def apply(
    id: String,
    request: IncomingRequest,
    requestWaited: Boolean,
    responseWaited: Boolean,
    routeId: String,
    setLogFlag: spied | stubbed | reqModified | resModified => Unit,
    state: InterceptionState,
    subscriptions: js.Array[Handler]
  ): Interception = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestWaited = requestWaited.asInstanceOf[js.Any], responseWaited = responseWaited.asInstanceOf[js.Any], routeId = routeId.asInstanceOf[js.Any], setLogFlag = js.Any.fromFunction1(setLogFlag), state = state.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interception]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interception] (val x: Self) extends AnyVal {
    
    inline def setBrowserRequestId(value: String): Self = StObject.set(x, "browserRequestId", value.asInstanceOf[js.Any])
    
    inline def setBrowserRequestIdUndefined: Self = StObject.set(x, "browserRequestId", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestWaited(value: Boolean): Self = StObject.set(x, "requestWaited", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponseWaited(value: Boolean): Self = StObject.set(x, "responseWaited", value.asInstanceOf[js.Any])
    
    inline def setRouteId(value: String): Self = StObject.set(x, "routeId", value.asInstanceOf[js.Any])
    
    inline def setSetLogFlag(value: spied | stubbed | reqModified | resModified => Unit): Self = StObject.set(x, "setLogFlag", js.Any.fromFunction1(value))
    
    inline def setState(value: InterceptionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: js.Array[Handler]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsVarargs(value: Handler*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
