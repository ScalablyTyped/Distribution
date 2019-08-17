package typings.atAwsDashSdkClientDashLambdaDashNode.commandsDeleteEventSourceMappingCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteEventSourceMappingOutputMod.DeleteEventSourceMappingOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteEventSourceMappingCommand", "DeleteEventSourceMappingCommand")
@js.native
class DeleteEventSourceMappingCommand protected () extends Command[
      InputTypesUnion, 
      DeleteEventSourceMappingInput, 
      OutputTypesUnion, 
      DeleteEventSourceMappingOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteEventSourceMappingInput) = this()
  /* CompleteClass */
  override val input: DeleteEventSourceMappingInput = js.native
  val middlewareStack: MiddlewareStack[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[DeleteEventSourceMappingInput, DeleteEventSourceMappingOutput] = js.native
}

