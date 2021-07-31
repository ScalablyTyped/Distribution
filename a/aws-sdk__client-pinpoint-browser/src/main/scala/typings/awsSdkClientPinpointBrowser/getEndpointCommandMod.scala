package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
import typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEndpointCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEndpointCommand", "GetEndpointCommand")
  @js.native
  class GetEndpointCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetEndpointInput, 
          OutputTypesUnion, 
          GetEndpointOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetEndpointInput) = this()
    
    /* CompleteClass */
    override val input: GetEndpointInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetEndpointInput, GetEndpointOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
  }
}
