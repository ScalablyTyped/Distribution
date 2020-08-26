package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
import typings.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamsCommand", JSImport.Namespace)
@js.native
object listStreamsCommandMod extends js.Object {
  @js.native
  class ListStreamsCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamsInput, 
          OutputTypesUnion, 
          ListStreamsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListStreamsInput) = this()
    val middlewareStack: MiddlewareStack[ListStreamsInput, ListStreamsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
  }
  
}

