package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
import typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListTagsForStreamCommand", JSImport.Namespace)
@js.native
object listTagsForStreamCommandMod extends js.Object {
  @js.native
  class ListTagsForStreamCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForStreamInput, 
          OutputTypesUnion, 
          ListTagsForStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTagsForStreamInput) = this()
    val middlewareStack: MiddlewareStack[ListTagsForStreamInput, ListTagsForStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
  }
  
}

