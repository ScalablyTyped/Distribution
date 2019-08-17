package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDeleteItemCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteItemInputMod.DeleteItemInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteItemOutputMod.DeleteItemOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteItemCommand", "DeleteItemCommand")
@js.native
class DeleteItemCommand protected () extends Command[
      InputTypesUnion, 
      DeleteItemInput, 
      OutputTypesUnion, 
      DeleteItemOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteItemInput) = this()
  /* CompleteClass */
  override val input: DeleteItemInput = js.native
  val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
}

