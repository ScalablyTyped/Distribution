package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentsCommand", JSImport.Namespace)
@js.native
object getSegmentsCommandMod extends js.Object {
  @js.native
  class GetSegmentsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentsInput, 
          OutputTypesUnion, 
          GetSegmentsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentsInput) = this()
    val middlewareStack: MiddlewareStack[GetSegmentsInput, GetSegmentsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
  }
  
}

