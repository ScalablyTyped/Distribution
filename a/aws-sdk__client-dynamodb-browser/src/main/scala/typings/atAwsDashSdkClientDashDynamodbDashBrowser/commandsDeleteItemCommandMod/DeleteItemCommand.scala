package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsDeleteItemCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteItemInputMod.DeleteItemInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteItemOutputMod.DeleteItemOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteItemCommand", "DeleteItemCommand")
@js.native
class DeleteItemCommand protected () extends Command[
      InputTypesUnion, 
      DeleteItemInput, 
      OutputTypesUnion, 
      DeleteItemOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteItemInput) = this()
  /* CompleteClass */
  override val input: DeleteItemInput = js.native
  val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
}

