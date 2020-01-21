package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
import typings.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/CreateBucketCommand", JSImport.Namespace)
@js.native
object createBucketCommandMod extends js.Object {
  @js.native
  class CreateBucketCommand protected () extends Command[
          InputTypesUnion, 
          CreateBucketInput, 
          OutputTypesUnion, 
          CreateBucketOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBucketInput) = this()
    /* CompleteClass */
    override val input: CreateBucketInput = js.native
    val middlewareStack: MiddlewareStack[CreateBucketInput, CreateBucketOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateBucketInput, CreateBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateBucketInput, CreateBucketOutput] = js.native
  }
  
}

