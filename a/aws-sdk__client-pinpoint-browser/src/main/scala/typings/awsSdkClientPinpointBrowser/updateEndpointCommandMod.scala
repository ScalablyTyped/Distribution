package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointCommand", JSImport.Namespace)
@js.native
object updateEndpointCommandMod extends js.Object {
  @js.native
  class UpdateEndpointCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEndpointInput, 
          OutputTypesUnion, 
          UpdateEndpointOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateEndpointInput) = this()
    /* CompleteClass */
    override val input: UpdateEndpointInput = js.native
    val middlewareStack: MiddlewareStack[UpdateEndpointInput, UpdateEndpointOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
  }
  
}

