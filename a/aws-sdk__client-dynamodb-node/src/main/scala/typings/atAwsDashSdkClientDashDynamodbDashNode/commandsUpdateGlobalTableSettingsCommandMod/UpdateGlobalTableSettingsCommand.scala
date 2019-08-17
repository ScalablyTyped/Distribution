package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsUpdateGlobalTableSettingsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableSettingsOutputMod.UpdateGlobalTableSettingsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableSettingsCommand", "UpdateGlobalTableSettingsCommand")
@js.native
class UpdateGlobalTableSettingsCommand protected () extends Command[
      InputTypesUnion, 
      UpdateGlobalTableSettingsInput, 
      OutputTypesUnion, 
      UpdateGlobalTableSettingsOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateGlobalTableSettingsInput) = this()
  /* CompleteClass */
  override val input: UpdateGlobalTableSettingsInput = js.native
  val middlewareStack: MiddlewareStack[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateGlobalTableSettingsInput, UpdateGlobalTableSettingsOutput] = js.native
}

