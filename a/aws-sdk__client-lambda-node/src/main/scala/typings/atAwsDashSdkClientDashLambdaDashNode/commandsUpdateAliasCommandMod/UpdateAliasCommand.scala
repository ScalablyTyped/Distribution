package typings.atAwsDashSdkClientDashLambdaDashNode.commandsUpdateAliasCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateAliasInputMod.UpdateAliasInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateAliasOutputMod.UpdateAliasOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateAliasCommand", "UpdateAliasCommand")
@js.native
class UpdateAliasCommand protected () extends Command[
      InputTypesUnion, 
      UpdateAliasInput, 
      OutputTypesUnion, 
      UpdateAliasOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateAliasInput) = this()
  /* CompleteClass */
  override val input: UpdateAliasInput = js.native
  val middlewareStack: MiddlewareStack[UpdateAliasInput, UpdateAliasOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
}

