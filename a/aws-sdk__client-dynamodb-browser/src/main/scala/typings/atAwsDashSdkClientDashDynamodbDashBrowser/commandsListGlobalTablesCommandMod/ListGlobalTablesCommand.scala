package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsListGlobalTablesCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListGlobalTablesCommand", "ListGlobalTablesCommand")
@js.native
class ListGlobalTablesCommand protected () extends Command[
      InputTypesUnion, 
      ListGlobalTablesInput, 
      OutputTypesUnion, 
      ListGlobalTablesOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListGlobalTablesInput) = this()
  /* CompleteClass */
  override val input: ListGlobalTablesInput = js.native
  val middlewareStack: MiddlewareStack[ListGlobalTablesInput, ListGlobalTablesOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
}

