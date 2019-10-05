package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesRestoreObjectInputMod.RestoreObjectInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesRestoreObjectOutputMod.RestoreObjectOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/RestoreObjectCommand", JSImport.Namespace)
@js.native
object commandsRestoreObjectCommandMod extends js.Object {
  @js.native
  class RestoreObjectCommand protected () extends Command[
          InputTypesUnion, 
          RestoreObjectInput, 
          OutputTypesUnion, 
          RestoreObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: RestoreObjectInput) = this()
    /* CompleteClass */
    override val input: RestoreObjectInput = js.native
    val middlewareStack: MiddlewareStack[RestoreObjectInput, RestoreObjectOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
  }
  
}

