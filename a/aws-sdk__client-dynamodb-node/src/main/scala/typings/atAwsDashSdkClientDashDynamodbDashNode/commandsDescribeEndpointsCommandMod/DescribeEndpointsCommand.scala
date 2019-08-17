package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDescribeEndpointsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeEndpointsCommand", "DescribeEndpointsCommand")
@js.native
class DescribeEndpointsCommand protected () extends Command[
      InputTypesUnion, 
      DescribeEndpointsInput, 
      OutputTypesUnion, 
      DescribeEndpointsOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeEndpointsInput) = this()
  /* CompleteClass */
  override val input: DescribeEndpointsInput = js.native
  val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
}

