package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
import typings.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSegmentCommand", JSImport.Namespace)
@js.native
object updateSegmentCommandMod extends js.Object {
  @js.native
  class UpdateSegmentCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSegmentInput, 
          OutputTypesUnion, 
          UpdateSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateSegmentInput) = this()
    /* CompleteClass */
    override val input: UpdateSegmentInput = js.native
    val middlewareStack: MiddlewareStack[UpdateSegmentInput, UpdateSegmentOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
  }
  
}

