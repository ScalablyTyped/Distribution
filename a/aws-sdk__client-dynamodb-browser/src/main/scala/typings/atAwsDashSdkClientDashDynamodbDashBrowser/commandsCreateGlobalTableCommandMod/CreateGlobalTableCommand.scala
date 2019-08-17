package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsCreateGlobalTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateGlobalTableOutputMod.CreateGlobalTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateGlobalTableCommand", "CreateGlobalTableCommand")
@js.native
class CreateGlobalTableCommand protected () extends Command[
      InputTypesUnion, 
      CreateGlobalTableInput, 
      OutputTypesUnion, 
      CreateGlobalTableOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: CreateGlobalTableInput) = this()
  /* CompleteClass */
  override val input: CreateGlobalTableInput = js.native
  val middlewareStack: MiddlewareStack[CreateGlobalTableInput, CreateGlobalTableOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
}

