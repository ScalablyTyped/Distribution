package typings.atAwsDashSdkClientDashLambdaDashNode.commandsTagResourceCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesTagResourceInputMod.TagResourceInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesTagResourceOutputMod.TagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/TagResourceCommand", "TagResourceCommand")
@js.native
class TagResourceCommand protected () extends Command[
      InputTypesUnion, 
      TagResourceInput, 
      OutputTypesUnion, 
      TagResourceOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: TagResourceInput) = this()
  /* CompleteClass */
  override val input: TagResourceInput = js.native
  val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[TagResourceInput, TagResourceOutput] = js.native
}

