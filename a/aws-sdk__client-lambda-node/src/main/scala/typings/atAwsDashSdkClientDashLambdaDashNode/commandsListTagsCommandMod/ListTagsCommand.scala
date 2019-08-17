package typings.atAwsDashSdkClientDashLambdaDashNode.commandsListTagsCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesListTagsInputMod.ListTagsInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesListTagsOutputMod.ListTagsOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListTagsCommand", "ListTagsCommand")
@js.native
class ListTagsCommand protected () extends Command[
      InputTypesUnion, 
      ListTagsInput, 
      OutputTypesUnion, 
      ListTagsOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListTagsInput) = this()
  /* CompleteClass */
  override val input: ListTagsInput = js.native
  val middlewareStack: MiddlewareStack[ListTagsInput, ListTagsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[ListTagsInput, ListTagsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[ListTagsInput, ListTagsOutput] = js.native
}

