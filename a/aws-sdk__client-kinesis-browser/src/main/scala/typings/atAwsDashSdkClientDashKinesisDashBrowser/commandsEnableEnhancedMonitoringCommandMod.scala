package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/EnableEnhancedMonitoringCommand", JSImport.Namespace)
@js.native
object commandsEnableEnhancedMonitoringCommandMod extends js.Object {
  @js.native
  class EnableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          EnableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          EnableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: EnableEnhancedMonitoringInput) = this()
    /* CompleteClass */
    override val input: EnableEnhancedMonitoringInput = js.native
    val middlewareStack: MiddlewareStack[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
  }
  
}

