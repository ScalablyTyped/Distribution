package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsUpdateContinuousBackupsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateContinuousBackupsOutputMod.UpdateContinuousBackupsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateContinuousBackupsCommand", "UpdateContinuousBackupsCommand")
@js.native
class UpdateContinuousBackupsCommand protected () extends Command[
      InputTypesUnion, 
      UpdateContinuousBackupsInput, 
      OutputTypesUnion, 
      UpdateContinuousBackupsOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateContinuousBackupsInput) = this()
  /* CompleteClass */
  override val input: UpdateContinuousBackupsInput = js.native
  val middlewareStack: MiddlewareStack[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
}

