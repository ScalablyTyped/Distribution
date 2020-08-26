package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
import typings.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateAppCommand", JSImport.Namespace)
@js.native
object createAppCommandMod extends js.Object {
  @js.native
  class CreateAppCommand protected () extends Command[
          InputTypesUnion, 
          CreateAppInput, 
          OutputTypesUnion, 
          CreateAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateAppInput) = this()
    val middlewareStack: MiddlewareStack[CreateAppInput, CreateAppOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
  }
  
}

