package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsTagResourceCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesTagResourceInputMod.TagResourceInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesTagResourceOutputMod.TagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/TagResourceCommand", "TagResourceCommand")
@js.native
class TagResourceCommand protected () extends Command[
      InputTypesUnion, 
      TagResourceInput, 
      OutputTypesUnion, 
      TagResourceOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: TagResourceInput) = this()
  /* CompleteClass */
  override val input: TagResourceInput = js.native
  val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
}

