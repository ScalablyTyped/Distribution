package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
import typings.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteSegmentCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSegmentCommand", "DeleteSegmentCommand")
  @js.native
  class DeleteSegmentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteSegmentInput, 
          OutputTypesUnion, 
          DeleteSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteSegmentInput) = this()
    
    /* CompleteClass */
    override val input: DeleteSegmentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteSegmentInput, DeleteSegmentOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
  }
}
