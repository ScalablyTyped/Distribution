package typings.atAwsDashSdkClientDashLambdaDashNode.commandsUntagResourceCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUntagResourceInputMod.UntagResourceInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUntagResourceOutputMod.UntagResourceOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UntagResourceCommand", "UntagResourceCommand")
@js.native
class UntagResourceCommand protected () extends Command[
      InputTypesUnion, 
      UntagResourceInput, 
      OutputTypesUnion, 
      UntagResourceOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: UntagResourceInput) = this()
  /* CompleteClass */
  override val input: UntagResourceInput = js.native
  val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
}

