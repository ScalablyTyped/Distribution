package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
import typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetChannelsCommand", JSImport.Namespace)
@js.native
object getChannelsCommandMod extends js.Object {
  @js.native
  class GetChannelsCommand protected () extends Command[
          InputTypesUnion, 
          GetChannelsInput, 
          OutputTypesUnion, 
          GetChannelsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetChannelsInput) = this()
    /* CompleteClass */
    override val input: GetChannelsInput = js.native
    val middlewareStack: MiddlewareStack[GetChannelsInput, GetChannelsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
  }
  
}

