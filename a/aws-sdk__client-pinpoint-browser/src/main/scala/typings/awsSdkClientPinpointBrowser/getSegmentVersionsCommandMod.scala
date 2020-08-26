package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionsCommand", JSImport.Namespace)
@js.native
object getSegmentVersionsCommandMod extends js.Object {
  @js.native
  class GetSegmentVersionsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentVersionsInput, 
          OutputTypesUnion, 
          GetSegmentVersionsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentVersionsInput) = this()
    val middlewareStack: MiddlewareStack[GetSegmentVersionsInput, GetSegmentVersionsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
  }
  
}

