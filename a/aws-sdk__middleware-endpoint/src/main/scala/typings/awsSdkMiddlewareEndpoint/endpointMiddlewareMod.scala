package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.anon.Config
import typings.awsSdkTypes.endpointMod.EndpointParameters
import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/endpointMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointMiddleware[T /* <: EndpointParameters */](hasConfigInstructions: Config[T]): SerializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointMiddleware")(hasConfigInstructions.asInstanceOf[js.Any]).asInstanceOf[SerializeMiddleware[Any, Any]]
  
  trait PreviouslyResolvedServiceId extends StObject {
    
    var serviceId: js.UndefOr[String] = js.undefined
  }
  object PreviouslyResolvedServiceId {
    
    inline def apply(): PreviouslyResolvedServiceId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviouslyResolvedServiceId]
    }
    
    extension [Self <: PreviouslyResolvedServiceId](x: Self) {
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    }
  }
}
