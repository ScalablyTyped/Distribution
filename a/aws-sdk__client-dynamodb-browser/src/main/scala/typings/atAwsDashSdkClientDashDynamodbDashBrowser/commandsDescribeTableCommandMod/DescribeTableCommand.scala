package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsDescribeTableCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeTableInputMod.DescribeTableInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeTableOutputMod.DescribeTableOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTableCommand", "DescribeTableCommand")
@js.native
class DescribeTableCommand protected () extends Command[
      InputTypesUnion, 
      DescribeTableInput, 
      OutputTypesUnion, 
      DescribeTableOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeTableInput) = this()
  /* CompleteClass */
  override val input: DescribeTableInput = js.native
  val middlewareStack: MiddlewareStack[DescribeTableInput, DescribeTableOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
}

