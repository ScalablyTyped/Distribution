package typings.atAwsDashSdkClientDashXrayDashNode.commandsBatchGetTracesCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/BatchGetTracesCommand", "BatchGetTracesCommand")
@js.native
class BatchGetTracesCommand protected () extends Command[
      InputTypesUnion, 
      BatchGetTracesInput, 
      OutputTypesUnion, 
      BatchGetTracesOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: BatchGetTracesInput) = this()
  /* CompleteClass */
  override val input: BatchGetTracesInput = js.native
  val middlewareStack: MiddlewareStack[BatchGetTracesInput, BatchGetTracesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
}

