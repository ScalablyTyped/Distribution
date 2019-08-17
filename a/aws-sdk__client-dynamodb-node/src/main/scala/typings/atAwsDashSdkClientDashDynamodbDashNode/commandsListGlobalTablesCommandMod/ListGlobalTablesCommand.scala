package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsListGlobalTablesCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListGlobalTablesCommand", "ListGlobalTablesCommand")
@js.native
class ListGlobalTablesCommand protected () extends Command[
      InputTypesUnion, 
      ListGlobalTablesInput, 
      OutputTypesUnion, 
      ListGlobalTablesOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListGlobalTablesInput) = this()
  /* CompleteClass */
  override val input: ListGlobalTablesInput = js.native
  val middlewareStack: MiddlewareStack[ListGlobalTablesInput, ListGlobalTablesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
}

