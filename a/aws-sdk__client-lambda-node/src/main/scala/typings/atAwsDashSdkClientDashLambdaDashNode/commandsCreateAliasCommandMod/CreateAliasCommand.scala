package typings.atAwsDashSdkClientDashLambdaDashNode.commandsCreateAliasCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateAliasInputMod.CreateAliasInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateAliasOutputMod.CreateAliasOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateAliasCommand", "CreateAliasCommand")
@js.native
class CreateAliasCommand protected () extends Command[
      InputTypesUnion, 
      CreateAliasInput, 
      OutputTypesUnion, 
      CreateAliasOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateAliasInput) = this()
  /* CompleteClass */
  override val input: CreateAliasInput = js.native
  val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
}

