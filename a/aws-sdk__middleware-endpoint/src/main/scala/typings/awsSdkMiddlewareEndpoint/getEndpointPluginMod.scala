package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.endpointMiddlewareMod.PreviouslyResolvedServiceId
import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.typesMod.EndpointParameterInstructions
import typings.awsSdkTypes.endpointMod.EndpointParameters
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.middlewareMod.SerializeHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEndpointPluginMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/getEndpointPlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/getEndpointPlugin", "endpointMiddlewareOptions")
  @js.native
  val endpointMiddlewareOptions: SerializeHandlerOptions & RelativeMiddlewareOptions = js.native
  
  inline def getEndpointPlugin[T /* <: EndpointParameters */](
    config: EndpointResolvedConfig[T] & PreviouslyResolvedServiceId,
    instructions: EndpointParameterInstructions
  ): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPlugin")(config.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
}
