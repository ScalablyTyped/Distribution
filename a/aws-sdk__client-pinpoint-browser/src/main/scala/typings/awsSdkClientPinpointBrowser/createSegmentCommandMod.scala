package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
import typings.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateSegmentCommand", JSImport.Namespace)
@js.native
object createSegmentCommandMod extends js.Object {
  @js.native
  class CreateSegmentCommand protected () extends Command[
          InputTypesUnion, 
          CreateSegmentInput, 
          OutputTypesUnion, 
          CreateSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateSegmentInput) = this()
    /* CompleteClass */
    override val input: CreateSegmentInput = js.native
    val middlewareStack: MiddlewareStack[CreateSegmentInput, CreateSegmentOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
  }
  
}

