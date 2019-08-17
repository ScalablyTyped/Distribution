package typings.atAwsDashSdkClientDashLambdaDashNode.commandsGetPolicyCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetPolicyInputMod.GetPolicyInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetPolicyOutputMod.GetPolicyOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetPolicyCommand", "GetPolicyCommand")
@js.native
class GetPolicyCommand protected () extends Command[
      InputTypesUnion, 
      GetPolicyInput, 
      OutputTypesUnion, 
      GetPolicyOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetPolicyInput) = this()
  /* CompleteClass */
  override val input: GetPolicyInput = js.native
  val middlewareStack: MiddlewareStack[GetPolicyInput, GetPolicyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
}

