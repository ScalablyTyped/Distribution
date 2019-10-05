package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketCorsInputMod.PutBucketCorsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketCorsOutputMod.PutBucketCorsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketCorsCommand", JSImport.Namespace)
@js.native
object commandsPutBucketCorsCommandMod extends js.Object {
  @js.native
  class PutBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketCorsInput, 
          OutputTypesUnion, 
          PutBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketCorsInput) = this()
    /* CompleteClass */
    override val input: PutBucketCorsInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketCorsInput, PutBucketCorsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
  }
  
}

