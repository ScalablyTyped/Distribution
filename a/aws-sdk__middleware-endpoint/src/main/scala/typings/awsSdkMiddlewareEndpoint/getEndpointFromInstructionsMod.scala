package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.typesMod.EndpointParameterInstructions
import typings.awsSdkTypes.endpointMod.EndpointParameters
import typings.awsSdkTypes.endpointMod.EndpointV2
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEndpointFromInstructionsMod {
  
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
  
  /* Inlined std.Partial<{getEndpointParameterInstructions (): @aws-sdk/middleware-endpoint.@aws-sdk/middleware-endpoint/dist-types/types.EndpointParameterInstructions}> */
  trait EndpointParameterInstructionsSupplier extends StObject {
    
    var getEndpointParameterInstructions: js.UndefOr[js.Function0[EndpointParameterInstructions]] = js.undefined
  }
  object EndpointParameterInstructionsSupplier {
    
    inline def apply(): EndpointParameterInstructionsSupplier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointParameterInstructionsSupplier]
    }
    
    extension [Self <: EndpointParameterInstructionsSupplier](x: Self) {
      
      inline def setGetEndpointParameterInstructions(value: () => EndpointParameterInstructions): Self = StObject.set(x, "getEndpointParameterInstructions", js.Any.fromFunction0(value))
      
      inline def setGetEndpointParameterInstructionsUndefined: Self = StObject.set(x, "getEndpointParameterInstructions", js.undefined)
    }
  }
}
