package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsBatchWriteItemCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBatchWriteItemOutputMod.BatchWriteItemOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/BatchWriteItemCommand", "BatchWriteItemCommand")
@js.native
class BatchWriteItemCommand protected () extends Command[
      InputTypesUnion, 
      BatchWriteItemInput, 
      OutputTypesUnion, 
      BatchWriteItemOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: BatchWriteItemInput) = this()
  /* CompleteClass */
  override val input: BatchWriteItemInput = js.native
  val middlewareStack: MiddlewareStack[BatchWriteItemInput, BatchWriteItemOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
}

