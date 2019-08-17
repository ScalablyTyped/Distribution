package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsCreateBackupCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateBackupInputMod.CreateBackupInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateBackupOutputMod.CreateBackupOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/CreateBackupCommand", "CreateBackupCommand")
@js.native
class CreateBackupCommand protected () extends Command[
      InputTypesUnion, 
      CreateBackupInput, 
      OutputTypesUnion, 
      CreateBackupOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateBackupInput) = this()
  /* CompleteClass */
  override val input: CreateBackupInput = js.native
  val middlewareStack: MiddlewareStack[CreateBackupInput, CreateBackupOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
}

