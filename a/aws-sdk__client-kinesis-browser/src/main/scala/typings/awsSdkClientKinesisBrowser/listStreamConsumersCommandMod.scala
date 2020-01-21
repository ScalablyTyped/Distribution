package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
import typings.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamConsumersCommand", JSImport.Namespace)
@js.native
object listStreamConsumersCommandMod extends js.Object {
  @js.native
  class ListStreamConsumersCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamConsumersInput, 
          OutputTypesUnion, 
          ListStreamConsumersOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListStreamConsumersInput) = this()
    /* CompleteClass */
    override val input: ListStreamConsumersInput = js.native
    val middlewareStack: MiddlewareStack[ListStreamConsumersInput, ListStreamConsumersOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
  }
  
}

