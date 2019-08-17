package typings.atAwsDashSdkClientDashS3DashNode.commandsGetObjectTorrentCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectTorrentInputMod.GetObjectTorrentInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectTorrentCommand", "GetObjectTorrentCommand")
@js.native
class GetObjectTorrentCommand protected () extends Command[
      InputTypesUnion, 
      GetObjectTorrentInput, 
      OutputTypesUnion, 
      GetObjectTorrentOutput[Readable], 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetObjectTorrentInput) = this()
  /* CompleteClass */
  override val input: GetObjectTorrentInput = js.native
  val middlewareStack: MiddlewareStack[GetObjectTorrentInput, GetObjectTorrentOutput[Readable], Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Readable]] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Readable]] = js.native
}

