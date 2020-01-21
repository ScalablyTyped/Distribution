package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
import typings.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppsCommand", JSImport.Namespace)
@js.native
object getAppsCommandMod extends js.Object {
  @js.native
  class GetAppsCommand protected () extends Command[
          InputTypesUnion, 
          GetAppsInput, 
          OutputTypesUnion, 
          GetAppsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppsInput) = this()
    /* CompleteClass */
    override val input: GetAppsInput = js.native
    val middlewareStack: MiddlewareStack[GetAppsInput, GetAppsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
  }
  
}

