package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
import typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEndpointCommand", JSImport.Namespace)
@js.native
object getEndpointCommandMod extends js.Object {
  @js.native
  class GetEndpointCommand protected () extends Command[
          InputTypesUnion, 
          GetEndpointInput, 
          OutputTypesUnion, 
          GetEndpointOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetEndpointInput) = this()
    val middlewareStack: MiddlewareStack[GetEndpointInput, GetEndpointOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
  }
  
}

