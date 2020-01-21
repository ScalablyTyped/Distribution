package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
import typings.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppCommand", JSImport.Namespace)
@js.native
object getAppCommandMod extends js.Object {
  @js.native
  class GetAppCommand protected () extends Command[
          InputTypesUnion, 
          GetAppInput, 
          OutputTypesUnion, 
          GetAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppInput) = this()
    /* CompleteClass */
    override val input: GetAppInput = js.native
    val middlewareStack: MiddlewareStack[GetAppInput, GetAppOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
  }
  
}

