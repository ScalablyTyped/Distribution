package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
import typings.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventStreamCommand", JSImport.Namespace)
@js.native
object putEventStreamCommandMod extends js.Object {
  @js.native
  class PutEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          PutEventStreamInput, 
          OutputTypesUnion, 
          PutEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutEventStreamInput) = this()
    val middlewareStack: MiddlewareStack[PutEventStreamInput, PutEventStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
  }
  
}

