package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsDescribeContinuousBackupsCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeContinuousBackupsCommand", "DescribeContinuousBackupsCommand")
@js.native
class DescribeContinuousBackupsCommand protected () extends Command[
      InputTypesUnion, 
      DescribeContinuousBackupsInput, 
      OutputTypesUnion, 
      DescribeContinuousBackupsOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: DescribeContinuousBackupsInput) = this()
  /* CompleteClass */
  override val input: DescribeContinuousBackupsInput = js.native
  val middlewareStack: MiddlewareStack[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
}

