package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsUpdateGlobalTableSettingsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateGlobalTableSettingsCommand", "UpdateGlobalTableSettingsCommand")
@js.native
class UpdateGlobalTableSettingsCommand protected () extends Command[
      InputTypesUnion, 
      UpdateGlobalTableSettingsInput, 
      OutputTypesUnion, 
      UpdateGlobalTableSettingsOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateGlobalTableSettingsInput) = this()
  /* CompleteClass */
  override val input: UpdateGlobalTableSettingsInput = js.native
  val middlewareStack: MiddlewareStack[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
}

