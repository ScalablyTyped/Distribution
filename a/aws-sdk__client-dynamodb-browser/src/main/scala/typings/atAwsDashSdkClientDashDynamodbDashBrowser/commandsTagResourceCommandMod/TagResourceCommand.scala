package typings.atAwsDashSdkClientDashDynamodbDashBrowser.commandsTagResourceCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTagResourceInputMod.TagResourceInput
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTagResourceOutputMod.TagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/TagResourceCommand", "TagResourceCommand")
@js.native
class TagResourceCommand protected () extends Command[
      InputTypesUnion, 
      TagResourceInput, 
      OutputTypesUnion, 
      TagResourceOutput, 
      DynamoDBResolvedConfiguration, 
      Blob
    ] {
  def this(input: TagResourceInput) = this()
  /* CompleteClass */
  override val input: TagResourceInput = js.native
  val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
}

