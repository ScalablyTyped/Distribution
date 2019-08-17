package typings.atAwsDashSdkClientDashLambdaDashNode.commandsInvokeAsyncCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeAsyncOutputMod.InvokeAsyncOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/InvokeAsyncCommand", "InvokeAsyncCommand")
@js.native
class InvokeAsyncCommand protected () extends Command[
      InputTypesUnion, 
      InvokeAsyncInput[Readable], 
      OutputTypesUnion, 
      InvokeAsyncOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: InvokeAsyncInput[Readable]) = this()
  /* CompleteClass */
  override val input: InvokeAsyncInput[Readable] = js.native
  val middlewareStack: MiddlewareStack[InvokeAsyncInput[Readable], InvokeAsyncOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
}

