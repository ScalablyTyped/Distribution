package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsRestoreTableFromBackupCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupOutputMod.RestoreTableFromBackupOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/RestoreTableFromBackupCommand", "RestoreTableFromBackupCommand")
@js.native
class RestoreTableFromBackupCommand protected () extends Command[
      InputTypesUnion, 
      RestoreTableFromBackupInput, 
      OutputTypesUnion, 
      RestoreTableFromBackupOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: RestoreTableFromBackupInput) = this()
  /* CompleteClass */
  override val input: RestoreTableFromBackupInput = js.native
  val middlewareStack: MiddlewareStack[RestoreTableFromBackupInput, RestoreTableFromBackupOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
}

