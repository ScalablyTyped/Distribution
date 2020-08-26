package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteObjectTaggingInputMod.DeleteObjectTaggingInput
import typings.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod.DeleteObjectTaggingOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteObjectTaggingCommand", JSImport.Namespace)
@js.native
object deleteObjectTaggingCommandMod extends js.Object {
  @js.native
  class DeleteObjectTaggingCommand protected () extends Command[
          InputTypesUnion, 
          DeleteObjectTaggingInput, 
          OutputTypesUnion, 
          DeleteObjectTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteObjectTaggingInput) = this()
    val middlewareStack: MiddlewareStack[DeleteObjectTaggingInput, DeleteObjectTaggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectTaggingInput, DeleteObjectTaggingOutput] = js.native
  }
  
}

