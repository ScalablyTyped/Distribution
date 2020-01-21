package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesHeadObjectInputMod.HeadObjectInput
import typings.awsSdkClientS3Node.typesHeadObjectOutputMod.HeadObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/HeadObjectCommand", JSImport.Namespace)
@js.native
object headObjectCommandMod extends js.Object {
  @js.native
  class HeadObjectCommand protected () extends Command[
          InputTypesUnion, 
          HeadObjectInput, 
          OutputTypesUnion, 
          HeadObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: HeadObjectInput) = this()
    /* CompleteClass */
    override val input: HeadObjectInput = js.native
    val middlewareStack: MiddlewareStack[HeadObjectInput, HeadObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[HeadObjectInput, HeadObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[HeadObjectInput, HeadObjectOutput] = js.native
  }
  
}

