package typings.atAwsDashSdkClientDashSqsDashNode.commandsAddPermissionCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesAddPermissionInputMod.AddPermissionInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesAddPermissionOutputMod.AddPermissionOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/AddPermissionCommand", "AddPermissionCommand")
@js.native
class AddPermissionCommand protected () extends Command[
      InputTypesUnion, 
      AddPermissionInput, 
      OutputTypesUnion, 
      AddPermissionOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: AddPermissionInput) = this()
  /* CompleteClass */
  override val input: AddPermissionInput = js.native
  val middlewareStack: MiddlewareStack[AddPermissionInput, AddPermissionOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
}

