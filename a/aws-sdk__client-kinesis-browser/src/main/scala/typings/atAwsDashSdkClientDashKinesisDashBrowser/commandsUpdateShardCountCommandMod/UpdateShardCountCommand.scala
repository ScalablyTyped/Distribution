package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsUpdateShardCountCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/UpdateShardCountCommand", "UpdateShardCountCommand")
@js.native
class UpdateShardCountCommand protected () extends Command[
      InputTypesUnion, 
      UpdateShardCountInput, 
      OutputTypesUnion, 
      UpdateShardCountOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateShardCountInput) = this()
  /* CompleteClass */
  override val input: UpdateShardCountInput = js.native
  val middlewareStack: MiddlewareStack[UpdateShardCountInput, UpdateShardCountOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
}

