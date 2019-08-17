package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsCreateTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateTableInputMod.CreateTableInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateTableOutputMod.CreateTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/CreateTableCommand", "CreateTableCommand")
@js.native
class CreateTableCommand protected () extends Command[
      InputTypesUnion, 
      CreateTableInput, 
      OutputTypesUnion, 
      CreateTableOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateTableInput) = this()
  /* CompleteClass */
  override val input: CreateTableInput = js.native
  val middlewareStack: MiddlewareStack[CreateTableInput, CreateTableOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateTableInput, CreateTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateTableInput, CreateTableOutput] = js.native
}

