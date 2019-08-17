package typings.atAwsDashSdkClientDashLambdaDashNode.commandsCreateEventSourceMappingCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateEventSourceMappingOutputMod.CreateEventSourceMappingOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateEventSourceMappingCommand", "CreateEventSourceMappingCommand")
@js.native
class CreateEventSourceMappingCommand protected () extends Command[
      InputTypesUnion, 
      CreateEventSourceMappingInput, 
      OutputTypesUnion, 
      CreateEventSourceMappingOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateEventSourceMappingInput) = this()
  /* CompleteClass */
  override val input: CreateEventSourceMappingInput = js.native
  val middlewareStack: MiddlewareStack[CreateEventSourceMappingInput, CreateEventSourceMappingOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[CreateEventSourceMappingInput, CreateEventSourceMappingOutput] = js.native
}

