package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsListTablesCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListTablesInputMod.ListTablesInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListTablesOutputMod.ListTablesOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListTablesCommand", "ListTablesCommand")
@js.native
class ListTablesCommand protected () extends Command[
      InputTypesUnion, 
      ListTablesInput, 
      OutputTypesUnion, 
      ListTablesOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListTablesInput) = this()
  /* CompleteClass */
  override val input: ListTablesInput = js.native
  val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListTablesInput, ListTablesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListTablesInput, ListTablesOutput] = js.native
}

