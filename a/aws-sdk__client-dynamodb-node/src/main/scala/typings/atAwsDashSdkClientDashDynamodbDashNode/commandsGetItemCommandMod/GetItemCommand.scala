package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsGetItemCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesGetItemInputMod.GetItemInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesGetItemOutputMod.GetItemOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/GetItemCommand", "GetItemCommand")
@js.native
class GetItemCommand protected () extends Command[
      InputTypesUnion, 
      GetItemInput, 
      OutputTypesUnion, 
      GetItemOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetItemInput) = this()
  /* CompleteClass */
  override val input: GetItemInput = js.native
  val middlewareStack: MiddlewareStack[GetItemInput, GetItemOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[GetItemInput, GetItemOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[GetItemInput, GetItemOutput] = js.native
}

