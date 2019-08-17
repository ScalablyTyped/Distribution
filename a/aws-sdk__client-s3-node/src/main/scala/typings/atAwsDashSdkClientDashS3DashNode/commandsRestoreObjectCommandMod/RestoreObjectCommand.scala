package typings.atAwsDashSdkClientDashS3DashNode.commandsRestoreObjectCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesRestoreObjectInputMod.RestoreObjectInput
import typings.atAwsDashSdkClientDashS3DashNode.typesRestoreObjectOutputMod.RestoreObjectOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/RestoreObjectCommand", "RestoreObjectCommand")
@js.native
class RestoreObjectCommand protected () extends Command[
      InputTypesUnion, 
      RestoreObjectInput, 
      OutputTypesUnion, 
      RestoreObjectOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: RestoreObjectInput) = this()
  /* CompleteClass */
  override val input: RestoreObjectInput = js.native
  val middlewareStack: MiddlewareStack[RestoreObjectInput, RestoreObjectOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
}

