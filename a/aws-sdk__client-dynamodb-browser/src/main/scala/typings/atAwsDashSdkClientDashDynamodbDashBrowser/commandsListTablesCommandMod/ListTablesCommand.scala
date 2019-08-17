package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsListTablesCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTablesInputMod.ListTablesInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTablesOutputMod.ListTablesOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListTablesCommand", "ListTablesCommand")
@js.native
class ListTablesCommand protected () extends Command[
      InputTypesUnion, 
      ListTablesInput, 
      OutputTypesUnion, 
      ListTablesOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListTablesInput) = this()
  /* CompleteClass */
  override val input: ListTablesInput = js.native
  val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListTablesInput, ListTablesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListTablesInput, ListTablesOutput] = js.native
}

