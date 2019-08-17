package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsDescribeEndpointsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeEndpointsCommand", "DescribeEndpointsCommand")
@js.native
class DescribeEndpointsCommand protected () extends Command[
      InputTypesUnion, 
      DescribeEndpointsInput, 
      OutputTypesUnion, 
      DescribeEndpointsOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeEndpointsInput) = this()
  /* CompleteClass */
  override val input: DescribeEndpointsInput = js.native
  val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
}

