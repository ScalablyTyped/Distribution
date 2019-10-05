package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/IncreaseStreamRetentionPeriodCommand", JSImport.Namespace)
@js.native
object commandsIncreaseStreamRetentionPeriodCommandMod extends js.Object {
  @js.native
  class IncreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          IncreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          IncreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: IncreaseStreamRetentionPeriodInput) = this()
    /* CompleteClass */
    override val input: IncreaseStreamRetentionPeriodInput = js.native
    val middlewareStack: MiddlewareStack[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
  }
  
}

