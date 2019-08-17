package typings.atAwsDashSdkClientDashLambdaDashNode.commandsListEventSourceMappingsCommandMod

import typings.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesListEventSourceMappingsOutputMod.ListEventSourceMappingsOutput
import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListEventSourceMappingsCommand", "ListEventSourceMappingsCommand")
@js.native
class ListEventSourceMappingsCommand protected () extends Command[
      InputTypesUnion, 
      ListEventSourceMappingsInput, 
      OutputTypesUnion, 
      ListEventSourceMappingsOutput, 
      LambdaResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListEventSourceMappingsInput) = this()
  /* CompleteClass */
  override val input: ListEventSourceMappingsInput = js.native
  val middlewareStack: MiddlewareStack[ListEventSourceMappingsInput, ListEventSourceMappingsOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: LambdaResolvedConfiguration
  ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
}

