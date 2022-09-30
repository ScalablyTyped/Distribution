package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.anon.Config
import typings.awsSdkMiddlewareEndpoint.endpointMiddlewareMod.PreviouslyResolvedServiceId
import typings.awsSdkMiddlewareEndpoint.getEndpointFromInstructionsMod.EndpointParameterInstructionsSupplier
import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.EndpointInputConfig
import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.PreviouslyResolved
import typings.awsSdkMiddlewareEndpoint.typesMod.EndpointParameterInstructions
import typings.awsSdkTypes.endpointMod.EndpointParameters
import typings.awsSdkTypes.endpointMod.EndpointV2
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.middlewareMod.SerializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.SerializeMiddleware
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-endpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointMiddleware[T /* <: EndpointParameters */](hasConfigInstructions: Config[T]): SerializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("endpointMiddleware")(hasConfigInstructions.asInstanceOf[js.Any]).asInstanceOf[SerializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-endpoint", "endpointMiddlewareOptions")
  @js.native
  val endpointMiddlewareOptions: SerializeHandlerOptions & RelativeMiddlewareOptions = js.native
  
  inline def getEndpointFromInstructions[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config
  ): js.Promise[EndpointV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointFromInstructions")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointV2]]
  inline def getEndpointFromInstructions[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config,
    context: HandlerExecutionContext
  ): js.Promise[EndpointV2] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointFromInstructions")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointV2]]
  
  inline def getEndpointPlugin[T /* <: EndpointParameters */](
    config: EndpointResolvedConfig[T] & PreviouslyResolvedServiceId,
    instructions: EndpointParameterInstructions
  ): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPlugin")(config.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
  
  inline def resolveEndpointConfig[T, P /* <: EndpointParameters */](input: T & EndpointInputConfig[P] & PreviouslyResolved[P]): T & EndpointResolvedConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointResolvedConfig[P]]
  
  inline def toEndpointV1(endpoint: String): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: EndpointV2): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: Endpoint): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
}
