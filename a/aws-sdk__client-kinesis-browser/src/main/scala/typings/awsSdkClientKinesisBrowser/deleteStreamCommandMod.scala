package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeleteStreamCommand", JSImport.Namespace)
@js.native
object deleteStreamCommandMod extends js.Object {
  @js.native
  class DeleteStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteStreamInput, 
          OutputTypesUnion, 
          DeleteStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteStreamInput) = this()
    val middlewareStack: MiddlewareStack[DeleteStreamInput, DeleteStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
  }
  
}

