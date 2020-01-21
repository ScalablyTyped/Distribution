package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
import typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetUserEndpointsCommand", JSImport.Namespace)
@js.native
object getUserEndpointsCommandMod extends js.Object {
  @js.native
  class GetUserEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          GetUserEndpointsInput, 
          OutputTypesUnion, 
          GetUserEndpointsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetUserEndpointsInput) = this()
    /* CompleteClass */
    override val input: GetUserEndpointsInput = js.native
    val middlewareStack: MiddlewareStack[GetUserEndpointsInput, GetUserEndpointsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
  }
  
}

