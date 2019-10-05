package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLifecycleCommand", JSImport.Namespace)
@js.native
object commandsPutBucketLifecycleCommandMod extends js.Object {
  @js.native
  class PutBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLifecycleInput, 
          OutputTypesUnion, 
          PutBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketLifecycleInput) = this()
    /* CompleteClass */
    override val input: PutBucketLifecycleInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketLifecycleInput, PutBucketLifecycleOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
  }
  
}

