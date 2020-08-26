package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput
import typings.awsSdkClientPinpointBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteBaiduChannelCommand", JSImport.Namespace)
@js.native
object deleteBaiduChannelCommandMod extends js.Object {
  @js.native
  class DeleteBaiduChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBaiduChannelInput, 
          OutputTypesUnion, 
          DeleteBaiduChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBaiduChannelInput) = this()
    val middlewareStack: MiddlewareStack[DeleteBaiduChannelInput, DeleteBaiduChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteBaiduChannelInput, DeleteBaiduChannelOutput] = js.native
  }
  
}

