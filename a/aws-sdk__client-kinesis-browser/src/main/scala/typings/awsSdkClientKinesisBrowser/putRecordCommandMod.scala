package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
import typings.awsSdkClientKinesisBrowser.typesPutRecordOutputMod.PutRecordOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordCommand", JSImport.Namespace)
@js.native
object putRecordCommandMod extends js.Object {
  @js.native
  class PutRecordCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordInput, 
          OutputTypesUnion, 
          PutRecordOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutRecordInput) = this()
    /* CompleteClass */
    override val input: PutRecordInput = js.native
    val middlewareStack: MiddlewareStack[PutRecordInput, PutRecordOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
  }
  
}

