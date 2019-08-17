package typings.atAwsDashSdkClientDashLambdaDashNode.commandsGetFunctionConfigurationCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetFunctionConfigurationOutputMod.GetFunctionConfigurationOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionConfigurationCommand", "GetFunctionConfigurationCommand")
@js.native
class GetFunctionConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      GetFunctionConfigurationInput, 
      OutputTypesUnion, 
      GetFunctionConfigurationOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetFunctionConfigurationInput) = this()
  /* CompleteClass */
  override val input: GetFunctionConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[GetFunctionConfigurationInput, GetFunctionConfigurationOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
}

