package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteObjectInputMod.DeleteObjectInput
import typings.atAwsDashSdkClientDashS3DashNode.typesDeleteObjectOutputMod.DeleteObjectOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/DeleteObjectCommand", JSImport.Namespace)
@js.native
object commandsDeleteObjectCommandMod extends js.Object {
  @js.native
  class DeleteObjectCommand protected () extends Command[
          InputTypesUnion, 
          DeleteObjectInput, 
          OutputTypesUnion, 
          DeleteObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteObjectInput) = this()
    /* CompleteClass */
    override val input: DeleteObjectInput = js.native
    val middlewareStack: MiddlewareStack[DeleteObjectInput, DeleteObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectInput, DeleteObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectInput, DeleteObjectOutput] = js.native
  }
  
}

