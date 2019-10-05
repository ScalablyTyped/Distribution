package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketReplicationCommand", JSImport.Namespace)
@js.native
object commandsPutBucketReplicationCommandMod extends js.Object {
  @js.native
  class PutBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketReplicationInput, 
          OutputTypesUnion, 
          PutBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: PutBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketReplicationInput, PutBucketReplicationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
  }
  
}

