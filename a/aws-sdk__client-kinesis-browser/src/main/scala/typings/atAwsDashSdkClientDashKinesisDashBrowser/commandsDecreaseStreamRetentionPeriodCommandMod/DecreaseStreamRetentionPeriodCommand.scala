package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsDecreaseStreamRetentionPeriodCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DecreaseStreamRetentionPeriodCommand", "DecreaseStreamRetentionPeriodCommand")
@js.native
class DecreaseStreamRetentionPeriodCommand protected () extends Command[
      InputTypesUnion, 
      DecreaseStreamRetentionPeriodInput, 
      OutputTypesUnion, 
      DecreaseStreamRetentionPeriodOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: DecreaseStreamRetentionPeriodInput) = this()
  /* CompleteClass */
  override val input: DecreaseStreamRetentionPeriodInput = js.native
  val middlewareStack: MiddlewareStack[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
}

