package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsUntagResourceCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUntagResourceInputMod.UntagResourceInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUntagResourceOutputMod.UntagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UntagResourceCommand", "UntagResourceCommand")
@js.native
class UntagResourceCommand protected () extends Command[
      InputTypesUnion, 
      UntagResourceInput, 
      OutputTypesUnion, 
      UntagResourceOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: UntagResourceInput) = this()
  /* CompleteClass */
  override val input: UntagResourceInput = js.native
  val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
}

