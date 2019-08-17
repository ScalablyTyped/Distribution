package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDeleteTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteTableInputMod.DeleteTableInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteTableOutputMod.DeleteTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteTableCommand", "DeleteTableCommand")
@js.native
class DeleteTableCommand protected () extends Command[
      InputTypesUnion, 
      DeleteTableInput, 
      OutputTypesUnion, 
      DeleteTableOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteTableInput) = this()
  /* CompleteClass */
  override val input: DeleteTableInput = js.native
  val middlewareStack: MiddlewareStack[DeleteTableInput, DeleteTableOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
}

