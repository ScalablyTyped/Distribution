package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUploadPartInputMod.UploadPartInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUploadPartOutputMod.UploadPartOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCommand", JSImport.Namespace)
@js.native
object commandsUploadPartCommandMod extends js.Object {
  @js.native
  class UploadPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadPartInput[Blob], 
          OutputTypesUnion, 
          UploadPartOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: UploadPartInput[Blob]) = this()
    /* CompleteClass */
    override val input: UploadPartInput[Blob] = js.native
    val middlewareStack: MiddlewareStack[UploadPartInput[Blob], UploadPartOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Blob], UploadPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Blob], UploadPartOutput] = js.native
  }
  
}

