package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsUpdateGlobalTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableOutputMod.UpdateGlobalTableOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableCommand", "UpdateGlobalTableCommand")
@js.native
class UpdateGlobalTableCommand protected () extends Command[
      InputTypesUnion, 
      UpdateGlobalTableInput, 
      OutputTypesUnion, 
      UpdateGlobalTableOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateGlobalTableInput) = this()
  /* CompleteClass */
  override val input: UpdateGlobalTableInput = js.native
  val middlewareStack: MiddlewareStack[UpdateGlobalTableInput, UpdateGlobalTableOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
}

