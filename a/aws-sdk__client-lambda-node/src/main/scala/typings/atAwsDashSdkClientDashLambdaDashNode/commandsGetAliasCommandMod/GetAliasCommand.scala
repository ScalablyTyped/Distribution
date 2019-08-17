package typings.atAwsDashSdkClientDashLambdaDashNode.commandsGetAliasCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetAliasInputMod.GetAliasInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetAliasOutputMod.GetAliasOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAliasCommand", "GetAliasCommand")
@js.native
class GetAliasCommand protected () extends Command[
      InputTypesUnion, 
      GetAliasInput, 
      OutputTypesUnion, 
      GetAliasOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetAliasInput) = this()
  /* CompleteClass */
  override val input: GetAliasInput = js.native
  val middlewareStack: MiddlewareStack[GetAliasInput, GetAliasOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetAliasInput, GetAliasOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetAliasInput, GetAliasOutput] = js.native
}

