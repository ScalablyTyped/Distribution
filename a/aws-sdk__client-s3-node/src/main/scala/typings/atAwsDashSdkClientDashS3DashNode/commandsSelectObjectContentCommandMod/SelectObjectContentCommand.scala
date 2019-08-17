package typings.atAwsDashSdkClientDashS3DashNode.commandsSelectObjectContentCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesSelectObjectContentInputMod.SelectObjectContentInput
import typings.atAwsDashSdkClientDashS3DashNode.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/SelectObjectContentCommand", "SelectObjectContentCommand")
@js.native
class SelectObjectContentCommand protected () extends Command[
      InputTypesUnion, 
      SelectObjectContentInput, 
      OutputTypesUnion, 
      SelectObjectContentOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: SelectObjectContentInput) = this()
  /* CompleteClass */
  override val input: SelectObjectContentInput = js.native
  val middlewareStack: MiddlewareStack[SelectObjectContentInput, SelectObjectContentOutput, Readable] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
}

