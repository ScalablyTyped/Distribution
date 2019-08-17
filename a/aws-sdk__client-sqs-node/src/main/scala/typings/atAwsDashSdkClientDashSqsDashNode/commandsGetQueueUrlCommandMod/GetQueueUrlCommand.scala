package typings.atAwsDashSdkClientDashSqsDashNode.commandsGetQueueUrlCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesGetQueueUrlInputMod.GetQueueUrlInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/GetQueueUrlCommand", "GetQueueUrlCommand")
@js.native
class GetQueueUrlCommand protected () extends Command[
      InputTypesUnion, 
      GetQueueUrlInput, 
      OutputTypesUnion, 
      GetQueueUrlOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetQueueUrlInput) = this()
  /* CompleteClass */
  override val input: GetQueueUrlInput = js.native
  val middlewareStack: MiddlewareStack[GetQueueUrlInput, GetQueueUrlOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
}

