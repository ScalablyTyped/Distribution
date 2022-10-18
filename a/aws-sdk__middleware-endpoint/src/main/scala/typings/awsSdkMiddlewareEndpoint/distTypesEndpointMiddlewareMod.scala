package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.anon.Config
import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typings.awsSdkTypes.distTypesMiddlewareMod.SerializeMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/endpointMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointMiddleware[T /* <: EndpointParameters */](hasConfigInstructions: Config[T]): SerializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointMiddleware")(hasConfigInstructions.asInstanceOf[js.Any]).asInstanceOf[SerializeMiddleware[Any, Any]]
}
