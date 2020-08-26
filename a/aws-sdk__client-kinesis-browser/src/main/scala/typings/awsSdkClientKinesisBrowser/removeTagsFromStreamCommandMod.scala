package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
import typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/RemoveTagsFromStreamCommand", JSImport.Namespace)
@js.native
object removeTagsFromStreamCommandMod extends js.Object {
  @js.native
  class RemoveTagsFromStreamCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromStreamInput, 
          OutputTypesUnion, 
          RemoveTagsFromStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: RemoveTagsFromStreamInput) = this()
    val middlewareStack: MiddlewareStack[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
  }
  
}

