package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDescribeContinuousBackupsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
@js.native
class DescribeContinuousBackupsCommand protected () extends Command[
      InputTypesUnion, 
      DescribeContinuousBackupsInput, 
      OutputTypesUnion, 
      DescribeContinuousBackupsOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeContinuousBackupsInput) = this()
  /* CompleteClass */
  override val input: DescribeContinuousBackupsInput = js.native
  val middlewareStack: MiddlewareStack[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
}

