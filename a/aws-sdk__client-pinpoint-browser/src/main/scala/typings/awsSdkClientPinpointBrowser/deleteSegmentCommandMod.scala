package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
import typings.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSegmentCommand", JSImport.Namespace)
@js.native
object deleteSegmentCommandMod extends js.Object {
  @js.native
  class DeleteSegmentCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSegmentInput, 
          OutputTypesUnion, 
          DeleteSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteSegmentInput) = this()
    /* CompleteClass */
    override val input: DeleteSegmentInput = js.native
    val middlewareStack: MiddlewareStack[DeleteSegmentInput, DeleteSegmentOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
  }
  
}

