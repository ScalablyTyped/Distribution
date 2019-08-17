package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsBatchGetItemCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchGetItemInputMod.BatchGetItemInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchGetItemOutputMod.BatchGetItemOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/BatchGetItemCommand", "BatchGetItemCommand")
@js.native
class BatchGetItemCommand protected () extends Command[
      InputTypesUnion, 
      BatchGetItemInput, 
      OutputTypesUnion, 
      BatchGetItemOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: BatchGetItemInput) = this()
  /* CompleteClass */
  override val input: BatchGetItemInput = js.native
  val middlewareStack: MiddlewareStack[BatchGetItemInput, BatchGetItemOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
}

