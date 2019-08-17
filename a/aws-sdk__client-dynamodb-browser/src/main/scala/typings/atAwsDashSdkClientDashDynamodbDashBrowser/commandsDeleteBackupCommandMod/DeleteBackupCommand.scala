package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsDeleteBackupCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteBackupInputMod.DeleteBackupInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteBackupOutputMod.DeleteBackupOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteBackupCommand", "DeleteBackupCommand")
@js.native
class DeleteBackupCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBackupInput, 
      OutputTypesUnion, 
      DeleteBackupOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteBackupInput) = this()
  /* CompleteClass */
  override val input: DeleteBackupInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBackupInput, DeleteBackupOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
}

