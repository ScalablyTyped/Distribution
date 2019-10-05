package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketAclInputMod.GetBucketAclInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketAclOutputMod.GetBucketAclOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAclCommand", JSImport.Namespace)
@js.native
object commandsGetBucketAclCommandMod extends js.Object {
  @js.native
  class GetBucketAclCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAclInput, 
          OutputTypesUnion, 
          GetBucketAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketAclInput) = this()
    /* CompleteClass */
    override val input: GetBucketAclInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketAclInput, GetBucketAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAclInput, GetBucketAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAclInput, GetBucketAclOutput] = js.native
  }
  
}

