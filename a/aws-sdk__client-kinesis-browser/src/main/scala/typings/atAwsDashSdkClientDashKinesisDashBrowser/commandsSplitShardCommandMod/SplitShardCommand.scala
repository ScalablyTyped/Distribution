package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsSplitShardCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesSplitShardInputMod.SplitShardInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesSplitShardOutputMod.SplitShardOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/SplitShardCommand", "SplitShardCommand")
@js.native
class SplitShardCommand protected () extends Command[
      InputTypesUnion, 
      SplitShardInput, 
      OutputTypesUnion, 
      SplitShardOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: SplitShardInput) = this()
  /* CompleteClass */
  override val input: SplitShardInput = js.native
  val middlewareStack: MiddlewareStack[SplitShardInput, SplitShardOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[SplitShardInput, SplitShardOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[SplitShardInput, SplitShardOutput] = js.native
}

