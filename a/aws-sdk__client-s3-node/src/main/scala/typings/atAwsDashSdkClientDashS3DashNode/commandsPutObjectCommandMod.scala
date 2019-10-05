package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutObjectInputMod.PutObjectInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutObjectOutputMod.PutObjectOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectCommand", JSImport.Namespace)
@js.native
object commandsPutObjectCommandMod extends js.Object {
  @js.native
  class PutObjectCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectInput[Readable], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectInput[Readable]) = this()
    /* CompleteClass */
    override val input: PutObjectInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[PutObjectInput[Readable], PutObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
  }
  
}

