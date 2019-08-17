package typings.atAwsDashSdkClientDashDynamodbDashNode.commandsListTagsOfResourceCommandMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesListTagsOfResourceOutputMod.ListTagsOfResourceOutput
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListTagsOfResourceCommand", "ListTagsOfResourceCommand")
@js.native
class ListTagsOfResourceCommand protected () extends Command[
      InputTypesUnion, 
      ListTagsOfResourceInput, 
      OutputTypesUnion, 
      ListTagsOfResourceOutput, 
      DynamoDBResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListTagsOfResourceInput) = this()
  /* CompleteClass */
  override val input: ListTagsOfResourceInput = js.native
  val middlewareStack: MiddlewareStack[ListTagsOfResourceInput, ListTagsOfResourceOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: DynamoDBResolvedConfiguration
  ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
}

