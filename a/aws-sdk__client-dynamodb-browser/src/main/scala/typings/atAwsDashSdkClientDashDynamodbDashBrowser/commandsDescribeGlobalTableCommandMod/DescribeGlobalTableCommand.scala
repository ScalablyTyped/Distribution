package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsDescribeGlobalTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableCommand", "DescribeGlobalTableCommand")
@js.native
class DescribeGlobalTableCommand protected () extends Command[
      InputTypesUnion, 
      DescribeGlobalTableInput, 
      OutputTypesUnion, 
      DescribeGlobalTableOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeGlobalTableInput) = this()
  /* CompleteClass */
  override val input: DescribeGlobalTableInput = js.native
  val middlewareStack: MiddlewareStack[DescribeGlobalTableInput, DescribeGlobalTableOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
}

