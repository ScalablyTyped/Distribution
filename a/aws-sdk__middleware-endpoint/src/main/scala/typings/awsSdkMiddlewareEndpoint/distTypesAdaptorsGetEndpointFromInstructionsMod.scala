package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptorsGetEndpointFromInstructionsMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/adaptors/getEndpointFromInstructions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def resolveParams[T /* <: EndpointParameters */, CommandInput /* <: Record[String, Any] */, Config /* <: Record[String, Any] */](
    commandInput: CommandInput,
    instructionsSupplier: EndpointParameterInstructionsSupplier,
    clientConfig: Partial[EndpointResolvedConfig[T]] & Config
  ): js.Promise[EndpointParameters] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveParams")(commandInput.asInstanceOf[js.Any], instructionsSupplier.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EndpointParameters]]
  
  /* Inlined std.Partial<{getEndpointParameterInstructions (): @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint/dist-types/types.EndpointParameterInstructions}> */
  trait EndpointParameterInstructionsSupplier extends StObject {
    
    var getEndpointParameterInstructions: js.UndefOr[js.Function0[EndpointParameterInstructions]] = js.undefined
  }
  object EndpointParameterInstructionsSupplier {
    
    inline def apply(): EndpointParameterInstructionsSupplier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointParameterInstructionsSupplier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointParameterInstructionsSupplier] (val x: Self) extends AnyVal {
      
      inline def setGetEndpointParameterInstructions(value: () => EndpointParameterInstructions): Self = StObject.set(x, "getEndpointParameterInstructions", js.Any.fromFunction0(value))
      
      inline def setGetEndpointParameterInstructionsUndefined: Self = StObject.set(x, "getEndpointParameterInstructions", js.undefined)
    }
  }
}
