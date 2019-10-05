package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketReplicationInputMod.GetBucketReplicationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketReplicationOutputMod.GetBucketReplicationOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketReplicationCommand", JSImport.Namespace)
@js.native
object commandsGetBucketReplicationCommandMod extends js.Object {
  @js.native
  class GetBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketReplicationInput, 
          OutputTypesUnion, 
          GetBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: GetBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketReplicationInput, GetBucketReplicationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketReplicationInput, GetBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketReplicationInput, GetBucketReplicationOutput] = js.native
  }
  
}

