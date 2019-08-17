package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsDescribeStreamCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamInputMod.DescribeStreamInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamOutputMod.DescribeStreamOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamCommand", "DescribeStreamCommand")
@js.native
class DescribeStreamCommand protected () extends Command[
      InputTypesUnion, 
      DescribeStreamInput, 
      OutputTypesUnion, 
      DescribeStreamOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeStreamInput) = this()
  /* CompleteClass */
  override val input: DescribeStreamInput = js.native
  val middlewareStack: MiddlewareStack[DescribeStreamInput, DescribeStreamOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[DescribeStreamInput, DescribeStreamOutput] = js.native
}

