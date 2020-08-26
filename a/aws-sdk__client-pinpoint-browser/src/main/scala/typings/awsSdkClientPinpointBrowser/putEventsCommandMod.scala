package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
import typings.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventsCommand", JSImport.Namespace)
@js.native
object putEventsCommandMod extends js.Object {
  @js.native
  class PutEventsCommand protected () extends Command[
          InputTypesUnion, 
          PutEventsInput, 
          OutputTypesUnion, 
          PutEventsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutEventsInput) = this()
    val middlewareStack: MiddlewareStack[PutEventsInput, PutEventsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventsInput, PutEventsOutput] = js.native
  }
  
}

