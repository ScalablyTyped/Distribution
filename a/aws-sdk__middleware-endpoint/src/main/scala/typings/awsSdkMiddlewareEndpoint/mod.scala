package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.anon.Config
import typings.awsSdkMiddlewareEndpoint.distTypesAdaptorsGetEndpointFromInstructionsMod.EndpointParameterInstructionsSupplier
import typings.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointInputConfig
import typings.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.PreviouslyResolved
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.SerializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.SerializeMiddleware
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
  
  inline def getEndpointPlugin[T /* <: EndpointParameters */](config: EndpointResolvedConfig[T], instructions: EndpointParameterInstructions): Pluggable[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointPlugin")(config.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any])).asInstanceOf[Pluggable[Any, Any]]
  
  inline def resolveEndpointConfig[T, P /* <: EndpointParameters */](input: T & EndpointInputConfig[P] & PreviouslyResolved[P]): T & EndpointResolvedConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & EndpointResolvedConfig[P]]
  
  inline def resolveParams[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config
  ): js.Promise[EndpointParameters] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveParams")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointParameters]]
  
  inline def toEndpointV1(endpoint: String): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: EndpointV2): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: Endpoint): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
}
