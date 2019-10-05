package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteAppInputMod.DeleteAppInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteAppOutputMod.DeleteAppOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteAppCommand", JSImport.Namespace)
@js.native
object commandsDeleteAppCommandMod extends js.Object {
  @js.native
  class DeleteAppCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAppInput, 
          OutputTypesUnion, 
          DeleteAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteAppInput) = this()
    /* CompleteClass */
    override val input: DeleteAppInput = js.native
    val middlewareStack: MiddlewareStack[DeleteAppInput, DeleteAppOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
  }
  
}

