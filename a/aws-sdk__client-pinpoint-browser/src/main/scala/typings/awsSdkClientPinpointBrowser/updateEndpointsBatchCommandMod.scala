package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
import typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointsBatchCommand", JSImport.Namespace)
@js.native
object updateEndpointsBatchCommandMod extends js.Object {
  @js.native
  class UpdateEndpointsBatchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEndpointsBatchInput, 
          OutputTypesUnion, 
          UpdateEndpointsBatchOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateEndpointsBatchInput) = this()
    val middlewareStack: MiddlewareStack[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
  }
  
}

