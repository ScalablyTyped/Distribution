package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsCreateTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateTableInputMod.CreateTableInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateTableOutputMod.CreateTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateTableCommand", "CreateTableCommand")
@js.native
class CreateTableCommand protected () extends Command[
      InputTypesUnion, 
      CreateTableInput, 
      OutputTypesUnion, 
      CreateTableOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: CreateTableInput) = this()
  /* CompleteClass */
  override val input: CreateTableInput = js.native
  val middlewareStack: MiddlewareStack[CreateTableInput, CreateTableOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateTableInput, CreateTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateTableInput, CreateTableOutput] = js.native
}

