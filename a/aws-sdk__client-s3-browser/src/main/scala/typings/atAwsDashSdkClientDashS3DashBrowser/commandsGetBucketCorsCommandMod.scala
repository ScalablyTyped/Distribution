package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketCorsInputMod.GetBucketCorsInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketCorsOutputMod.GetBucketCorsOutput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketCorsCommand", JSImport.Namespace)
@js.native
object commandsGetBucketCorsCommandMod extends js.Object {
  @js.native
  class GetBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketCorsInput, 
          OutputTypesUnion, 
          GetBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketCorsInput) = this()
    /* CompleteClass */
    override val input: GetBucketCorsInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketCorsInput, GetBucketCorsOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
  }
  
}

