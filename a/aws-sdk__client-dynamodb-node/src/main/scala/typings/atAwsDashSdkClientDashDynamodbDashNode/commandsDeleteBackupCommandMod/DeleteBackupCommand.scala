package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDeleteBackupCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteBackupInputMod.DeleteBackupInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteBackupOutputMod.DeleteBackupOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteBackupCommand", "DeleteBackupCommand")
@js.native
class DeleteBackupCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBackupInput, 
      OutputTypesUnion, 
      DeleteBackupOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteBackupInput) = this()
  /* CompleteClass */
  override val input: DeleteBackupInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBackupInput, DeleteBackupOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
}

