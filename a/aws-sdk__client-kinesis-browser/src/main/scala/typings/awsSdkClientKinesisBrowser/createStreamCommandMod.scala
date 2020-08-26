package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
import typings.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/CreateStreamCommand", JSImport.Namespace)
@js.native
object createStreamCommandMod extends js.Object {
  @js.native
  class CreateStreamCommand protected () extends Command[
          InputTypesUnion, 
          CreateStreamInput, 
          OutputTypesUnion, 
          CreateStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateStreamInput) = this()
    val middlewareStack: MiddlewareStack[CreateStreamInput, CreateStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
  }
  
}

