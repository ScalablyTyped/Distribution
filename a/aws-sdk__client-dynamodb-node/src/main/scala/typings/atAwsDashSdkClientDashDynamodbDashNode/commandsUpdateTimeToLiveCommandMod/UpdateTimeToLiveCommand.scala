package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsUpdateTimeToLiveCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTimeToLiveOutputMod.UpdateTimeToLiveOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTimeToLiveCommand", "UpdateTimeToLiveCommand")
@js.native
class UpdateTimeToLiveCommand protected () extends Command[
      InputTypesUnion, 
      UpdateTimeToLiveInput, 
      OutputTypesUnion, 
      UpdateTimeToLiveOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateTimeToLiveInput) = this()
  /* CompleteClass */
  override val input: UpdateTimeToLiveInput = js.native
  val middlewareStack: MiddlewareStack[UpdateTimeToLiveInput, UpdateTimeToLiveOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
}

