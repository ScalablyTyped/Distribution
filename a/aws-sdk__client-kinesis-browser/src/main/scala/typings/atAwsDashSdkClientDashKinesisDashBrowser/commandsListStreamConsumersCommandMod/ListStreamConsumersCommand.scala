package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsListStreamConsumersCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamConsumersCommand", "ListStreamConsumersCommand")
@js.native
class ListStreamConsumersCommand protected () extends Command[
      InputTypesUnion, 
      ListStreamConsumersInput, 
      OutputTypesUnion, 
      ListStreamConsumersOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListStreamConsumersInput) = this()
  /* CompleteClass */
  override val input: ListStreamConsumersInput = js.native
  val middlewareStack: MiddlewareStack[ListStreamConsumersInput, ListStreamConsumersOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
}

