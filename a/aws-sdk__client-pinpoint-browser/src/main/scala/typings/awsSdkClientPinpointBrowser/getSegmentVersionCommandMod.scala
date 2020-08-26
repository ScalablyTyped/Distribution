package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionCommand", JSImport.Namespace)
@js.native
object getSegmentVersionCommandMod extends js.Object {
  @js.native
  class GetSegmentVersionCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentVersionInput, 
          OutputTypesUnion, 
          GetSegmentVersionOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentVersionInput) = this()
    val middlewareStack: MiddlewareStack[GetSegmentVersionInput, GetSegmentVersionOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
  }
  
}

