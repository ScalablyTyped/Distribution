package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesMergeShardsInputMod.MergeShardsInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesMergeShardsOutputMod.MergeShardsOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/MergeShardsCommand", JSImport.Namespace)
@js.native
object commandsMergeShardsCommandMod extends js.Object {
  @js.native
  class MergeShardsCommand protected () extends Command[
          InputTypesUnion, 
          MergeShardsInput, 
          OutputTypesUnion, 
          MergeShardsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: MergeShardsInput) = this()
    /* CompleteClass */
    override val input: MergeShardsInput = js.native
    val middlewareStack: MiddlewareStack[MergeShardsInput, MergeShardsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
  }
  
}

