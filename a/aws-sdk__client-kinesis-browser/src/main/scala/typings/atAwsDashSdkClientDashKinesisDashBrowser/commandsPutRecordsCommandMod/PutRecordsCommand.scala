package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsPutRecordsCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsInputMod.PutRecordsInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsOutputMod.PutRecordsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordsCommand", "PutRecordsCommand")
@js.native
class PutRecordsCommand protected () extends Command[
      InputTypesUnion, 
      PutRecordsInput, 
      OutputTypesUnion, 
      PutRecordsOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutRecordsInput) = this()
  /* CompleteClass */
  override val input: PutRecordsInput = js.native
  val middlewareStack: MiddlewareStack[PutRecordsInput, PutRecordsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
}

