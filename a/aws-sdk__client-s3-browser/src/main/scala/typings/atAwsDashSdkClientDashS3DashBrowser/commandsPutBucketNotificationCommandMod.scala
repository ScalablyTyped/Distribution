package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketNotificationInputMod.PutBucketNotificationInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketNotificationCommand", JSImport.Namespace)
@js.native
object commandsPutBucketNotificationCommandMod extends js.Object {
  @js.native
  class PutBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketNotificationInput, 
          OutputTypesUnion, 
          PutBucketNotificationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketNotificationInput) = this()
    /* CompleteClass */
    override val input: PutBucketNotificationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketNotificationInput, PutBucketNotificationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
  }
  
}

