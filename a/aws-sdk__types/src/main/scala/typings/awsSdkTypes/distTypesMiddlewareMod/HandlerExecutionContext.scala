package typings.awsSdkTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.distTypesAuthMod.AuthScheme
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesLoggerMod.Logger
import typings.awsSdkTypes.distTypesUtilMod.UserAgent
import typings.awsSdkTypes.distTypesUtilMod.UserAgentPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerExecutionContext
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Set at the same time as endpointV2.
    */
  var authSchemes: js.UndefOr[js.Array[AuthScheme]] = js.undefined
  
  /**
    * Resolved by the endpointMiddleware function of @aws-sdk/middleware-endpoint
    * in the serialization stage.
    */
  var endpointV2: js.UndefOr[EndpointV2] = js.undefined
  
  /**
    * A logger that may be invoked by any handler during execution of an
    * operation.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  /**
    * Additional user agent that inferred by middleware. It can be used to save
    * the internal user agent sections without overriding the `customUserAgent`
    * config in clients.
    */
  var userAgent: js.UndefOr[UserAgent] = js.undefined
}
object HandlerExecutionContext {
  
  inline def apply(): HandlerExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerExecutionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlerExecutionContext] (val x: Self) extends AnyVal {
    
    inline def setAuthSchemes(value: js.Array[AuthScheme]): Self = StObject.set(x, "authSchemes", value.asInstanceOf[js.Any])
    
    inline def setAuthSchemesUndefined: Self = StObject.set(x, "authSchemes", js.undefined)
    
    inline def setAuthSchemesVarargs(value: AuthScheme*): Self = StObject.set(x, "authSchemes", js.Array(value*))
    
    inline def setEndpointV2(value: EndpointV2): Self = StObject.set(x, "endpointV2", value.asInstanceOf[js.Any])
    
    inline def setEndpointV2Undefined: Self = StObject.set(x, "endpointV2", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setUserAgent(value: UserAgent): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "userAgent", js.Array(value*))
  }
}
