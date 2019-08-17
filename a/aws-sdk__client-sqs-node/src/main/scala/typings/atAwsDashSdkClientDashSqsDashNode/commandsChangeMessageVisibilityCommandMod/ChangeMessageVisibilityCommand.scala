package typings.atAwsDashSdkClientDashSqsDashNode.commandsChangeMessageVisibilityCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityCommand", "ChangeMessageVisibilityCommand")
@js.native
class ChangeMessageVisibilityCommand protected () extends Command[
      InputTypesUnion, 
      ChangeMessageVisibilityInput, 
      OutputTypesUnion, 
      ChangeMessageVisibilityOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ChangeMessageVisibilityInput) = this()
  /* CompleteClass */
  override val input: ChangeMessageVisibilityInput = js.native
  val middlewareStack: MiddlewareStack[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[ChangeMessageVisibilityInput, ChangeMessageVisibilityOutput] = js.native
}

