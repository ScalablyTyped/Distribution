package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDescribeTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTableInputMod.DescribeTableInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeTableOutputMod.DescribeTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeTableCommand", "DescribeTableCommand")
@js.native
class DescribeTableCommand protected () extends Command[
      InputTypesUnion, 
      DescribeTableInput, 
      OutputTypesUnion, 
      DescribeTableOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeTableInput) = this()
  /* CompleteClass */
  override val input: DescribeTableInput = js.native
  val middlewareStack: MiddlewareStack[DescribeTableInput, DescribeTableOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
}

