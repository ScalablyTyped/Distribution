package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketRequestPaymentCommand", JSImport.Namespace)
@js.native
object commandsPutBucketRequestPaymentCommandMod extends js.Object {
  @js.native
  class PutBucketRequestPaymentCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketRequestPaymentInput, 
          OutputTypesUnion, 
          PutBucketRequestPaymentOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketRequestPaymentInput) = this()
    /* CompleteClass */
    override val input: PutBucketRequestPaymentInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
  }
  
}

