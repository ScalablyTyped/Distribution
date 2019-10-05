package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamConsumerCommand", JSImport.Namespace)
@js.native
object commandsDescribeStreamConsumerCommandMod extends js.Object {
  @js.native
  class DescribeStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamConsumerInput, 
          OutputTypesUnion, 
          DescribeStreamConsumerOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeStreamConsumerInput) = this()
    /* CompleteClass */
    override val input: DescribeStreamConsumerInput = js.native
    val middlewareStack: MiddlewareStack[DescribeStreamConsumerInput, DescribeStreamConsumerOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
  }
  
}

