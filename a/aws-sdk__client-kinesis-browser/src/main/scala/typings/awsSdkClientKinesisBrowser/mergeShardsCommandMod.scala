package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
import typings.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/MergeShardsCommand", JSImport.Namespace)
@js.native
object mergeShardsCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
  }
  
}

