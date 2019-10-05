package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateAppInputMod.CreateAppInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateAppOutputMod.CreateAppOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateAppCommand", JSImport.Namespace)
@js.native
object commandsCreateAppCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: CreateAppInput = js.native
    val middlewareStack: MiddlewareStack[CreateAppInput, CreateAppOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
  }
  
}

