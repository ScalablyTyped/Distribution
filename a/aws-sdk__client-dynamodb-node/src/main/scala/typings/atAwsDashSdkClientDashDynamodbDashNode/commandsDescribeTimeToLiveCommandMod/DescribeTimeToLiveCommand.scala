package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDescribeTimeToLiveCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTimeToLiveOutputMod.DescribeTimeToLiveOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeTimeToLiveCommand", "DescribeTimeToLiveCommand")
@js.native
class DescribeTimeToLiveCommand protected () extends Command[
      InputTypesUnion, 
      DescribeTimeToLiveInput, 
      OutputTypesUnion, 
      DescribeTimeToLiveOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeTimeToLiveInput) = this()
  /* CompleteClass */
  override val input: DescribeTimeToLiveInput = js.native
  val middlewareStack: MiddlewareStack[DescribeTimeToLiveInput, DescribeTimeToLiveOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeTimeToLiveInput, DescribeTimeToLiveOutput] = js.native
}

