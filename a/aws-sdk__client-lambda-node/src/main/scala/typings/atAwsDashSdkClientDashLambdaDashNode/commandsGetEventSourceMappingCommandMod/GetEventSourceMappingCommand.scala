package typings.atAwsDashSdkClientDashLambdaDashNode.commandsGetEventSourceMappingCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesGetEventSourceMappingOutputMod.GetEventSourceMappingOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetEventSourceMappingCommand", "GetEventSourceMappingCommand")
@js.native
class GetEventSourceMappingCommand protected () extends Command[
      InputTypesUnion, 
      GetEventSourceMappingInput, 
      OutputTypesUnion, 
      GetEventSourceMappingOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetEventSourceMappingInput) = this()
  /* CompleteClass */
  override val input: GetEventSourceMappingInput = js.native
  val middlewareStack: MiddlewareStack[GetEventSourceMappingInput, GetEventSourceMappingOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[GetEventSourceMappingInput, GetEventSourceMappingOutput] = js.native
}

