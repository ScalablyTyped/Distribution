package typings.atAwsDashSdkClientDashLambdaDashNode.commandsCreateFunctionCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionInputMod.CreateFunctionInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionOutputMod.CreateFunctionOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateFunctionCommand", "CreateFunctionCommand")
@js.native
class CreateFunctionCommand protected () extends Command[
      InputTypesUnion, 
      CreateFunctionInput, 
      OutputTypesUnion, 
      CreateFunctionOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateFunctionInput) = this()
  /* CompleteClass */
  override val input: CreateFunctionInput = js.native
  val middlewareStack: MiddlewareStack[CreateFunctionInput, CreateFunctionOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
}

