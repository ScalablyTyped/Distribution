package typings.atAwsDashSdkClientDashSqsDashNode.commandsCreateQueueCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueInputMod.CreateQueueInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueOutputMod.CreateQueueOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/CreateQueueCommand", "CreateQueueCommand")
@js.native
class CreateQueueCommand protected () extends Command[
      InputTypesUnion, 
      CreateQueueInput, 
      OutputTypesUnion, 
      CreateQueueOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateQueueInput) = this()
  /* CompleteClass */
  override val input: CreateQueueInput = js.native
  val middlewareStack: MiddlewareStack[CreateQueueInput, CreateQueueOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
}

