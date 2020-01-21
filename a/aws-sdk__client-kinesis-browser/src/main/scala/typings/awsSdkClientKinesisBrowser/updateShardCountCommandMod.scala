package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
import typings.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/UpdateShardCountCommand", JSImport.Namespace)
@js.native
object updateShardCountCommandMod extends js.Object {
  @js.native
  class UpdateShardCountCommand protected () extends Command[
          InputTypesUnion, 
          UpdateShardCountInput, 
          OutputTypesUnion, 
          UpdateShardCountOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateShardCountInput) = this()
    /* CompleteClass */
    override val input: UpdateShardCountInput = js.native
    val middlewareStack: MiddlewareStack[UpdateShardCountInput, UpdateShardCountOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
  }
  
}

