package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
import typings.awsSdkClientS3Node.typesListObjectsOutputMod.ListObjectsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectsCommand", JSImport.Namespace)
@js.native
object listObjectsCommandMod extends js.Object {
  @js.native
  class ListObjectsCommand protected () extends Command[
          InputTypesUnion, 
          ListObjectsInput, 
          OutputTypesUnion, 
          ListObjectsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListObjectsInput) = this()
    /* CompleteClass */
    override val input: ListObjectsInput = js.native
    val middlewareStack: MiddlewareStack[ListObjectsInput, ListObjectsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  }
  
}

