package typings.atAwsDashSdkClientDashSqsDashNode.commandsDeleteQueueCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteQueueInputMod.DeleteQueueInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteQueueOutputMod.DeleteQueueOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteQueueCommand", "DeleteQueueCommand")
@js.native
class DeleteQueueCommand protected () extends Command[
      InputTypesUnion, 
      DeleteQueueInput, 
      OutputTypesUnion, 
      DeleteQueueOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteQueueInput) = this()
  /* CompleteClass */
  override val input: DeleteQueueInput = js.native
  val middlewareStack: MiddlewareStack[DeleteQueueInput, DeleteQueueOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
}

