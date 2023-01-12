package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericStaticResponse[Fixture, Body] extends StObject {
  
  /**
    * Serve a static string/JSON object as the response body.
    */
  var body: js.UndefOr[Body] = js.undefined
  
  /**
    * Milliseconds to delay before the response is sent.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Serve a fixture as the response body.
    */
  var fixture: js.UndefOr[Fixture] = js.undefined
  
  /**
    * If 'forceNetworkError' is truthy, Cypress will destroy the browser connection
    * and send no response. Useful for simulating a server that is not reachable.
    * Must not be set in combination with other options.
    */
  var forceNetworkError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTTP headers to accompany the response.
    * @default {}
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The HTTP status code to send.
    * @default 200
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Kilobytes per second to send 'body'.
    */
  var throttleKbps: js.UndefOr[Double] = js.undefined
}
object GenericStaticResponse {
  
  inline def apply[Fixture, Body](): GenericStaticResponse[Fixture, Body] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericStaticResponse[Fixture, Body]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericStaticResponse[?, ?], Fixture, Body] (val x: Self & (GenericStaticResponse[Fixture, Body])) extends AnyVal {
    
    inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setFixture(value: Fixture): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
    
    inline def setFixtureUndefined: Self = StObject.set(x, "fixture", js.undefined)
    
    inline def setForceNetworkError(value: Boolean): Self = StObject.set(x, "forceNetworkError", value.asInstanceOf[js.Any])
    
    inline def setForceNetworkErrorUndefined: Self = StObject.set(x, "forceNetworkError", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setThrottleKbps(value: Double): Self = StObject.set(x, "throttleKbps", value.asInstanceOf[js.Any])
    
    inline def setThrottleKbpsUndefined: Self = StObject.set(x, "throttleKbps", js.undefined)
  }
}
