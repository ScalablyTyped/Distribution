package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketRequestPaymentInputMod.GetBucketRequestPaymentInput
import typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod.GetBucketRequestPaymentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketRequestPaymentCommand", JSImport.Namespace)
@js.native
object getBucketRequestPaymentCommandMod extends js.Object {
  @js.native
  class GetBucketRequestPaymentCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketRequestPaymentInput, 
          OutputTypesUnion, 
          GetBucketRequestPaymentOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketRequestPaymentInput) = this()
    /* CompleteClass */
    override val input: GetBucketRequestPaymentInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketRequestPaymentInput, GetBucketRequestPaymentOutput] = js.native
  }
  
}

