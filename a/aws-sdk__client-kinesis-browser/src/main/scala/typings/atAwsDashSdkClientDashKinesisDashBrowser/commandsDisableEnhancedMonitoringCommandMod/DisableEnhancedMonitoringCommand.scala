package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsDisableEnhancedMonitoringCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DisableEnhancedMonitoringCommand", "DisableEnhancedMonitoringCommand")
@js.native
class DisableEnhancedMonitoringCommand protected () extends Command[
      InputTypesUnion, 
      DisableEnhancedMonitoringInput, 
      OutputTypesUnion, 
      DisableEnhancedMonitoringOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: DisableEnhancedMonitoringInput) = this()
  /* CompleteClass */
  override val input: DisableEnhancedMonitoringInput = js.native
  val middlewareStack: MiddlewareStack[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
}

