package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsDescribeGlobalTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeGlobalTableCommand", "DescribeGlobalTableCommand")
@js.native
class DescribeGlobalTableCommand protected () extends Command[
      InputTypesUnion, 
      DescribeGlobalTableInput, 
      OutputTypesUnion, 
      DescribeGlobalTableOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeGlobalTableInput) = this()
  /* CompleteClass */
  override val input: DescribeGlobalTableInput = js.native
  val middlewareStack: MiddlewareStack[DescribeGlobalTableInput, DescribeGlobalTableOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
}

