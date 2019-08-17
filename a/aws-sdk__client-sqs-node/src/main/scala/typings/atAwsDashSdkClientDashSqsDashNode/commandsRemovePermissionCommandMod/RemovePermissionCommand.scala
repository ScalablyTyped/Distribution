package typings.atAwsDashSdkClientDashSqsDashNode.commandsRemovePermissionCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesRemovePermissionInputMod.RemovePermissionInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesRemovePermissionOutputMod.RemovePermissionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/RemovePermissionCommand", "RemovePermissionCommand")
@js.native
class RemovePermissionCommand protected () extends Command[
      InputTypesUnion, 
      RemovePermissionInput, 
      OutputTypesUnion, 
      RemovePermissionOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: RemovePermissionInput) = this()
  /* CompleteClass */
  override val input: RemovePermissionInput = js.native
  val middlewareStack: MiddlewareStack[RemovePermissionInput, RemovePermissionOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
}

