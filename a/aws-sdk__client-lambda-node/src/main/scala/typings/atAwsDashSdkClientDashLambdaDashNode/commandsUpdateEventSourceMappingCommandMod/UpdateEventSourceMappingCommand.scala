package typings.atAwsDashSdkClientDashLambdaDashNode.commandsUpdateEventSourceMappingCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingOutputMod.UpdateEventSourceMappingOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateEventSourceMappingCommand", "UpdateEventSourceMappingCommand")
@js.native
class UpdateEventSourceMappingCommand protected () extends Command[
      InputTypesUnion, 
      UpdateEventSourceMappingInput, 
      OutputTypesUnion, 
      UpdateEventSourceMappingOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: UpdateEventSourceMappingInput) = this()
  /* CompleteClass */
  override val input: UpdateEventSourceMappingInput = js.native
  val middlewareStack: MiddlewareStack[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
}

