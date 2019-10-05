package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutObjectTaggingInputMod.PutObjectTaggingInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectTaggingCommand", JSImport.Namespace)
@js.native
object commandsPutObjectTaggingCommandMod extends js.Object {
  @js.native
  class PutObjectTaggingCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectTaggingInput, 
          OutputTypesUnion, 
          PutObjectTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectTaggingInput) = this()
    /* CompleteClass */
    override val input: PutObjectTaggingInput = js.native
    val middlewareStack: MiddlewareStack[PutObjectTaggingInput, PutObjectTaggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectTaggingInput, PutObjectTaggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectTaggingInput, PutObjectTaggingOutput] = js.native
  }
  
}

