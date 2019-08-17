package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsGetShardIteratorCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetShardIteratorCommand", "GetShardIteratorCommand")
@js.native
class GetShardIteratorCommand protected () extends Command[
      InputTypesUnion, 
      GetShardIteratorInput, 
      OutputTypesUnion, 
      GetShardIteratorOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetShardIteratorInput) = this()
  /* CompleteClass */
  override val input: GetShardIteratorInput = js.native
  val middlewareStack: MiddlewareStack[GetShardIteratorInput, GetShardIteratorOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
}

