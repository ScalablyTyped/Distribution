package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsListStreamsCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamsInputMod.ListStreamsInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListStreamsOutputMod.ListStreamsOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamsCommand", "ListStreamsCommand")
@js.native
class ListStreamsCommand protected () extends Command[
      InputTypesUnion, 
      ListStreamsInput, 
      OutputTypesUnion, 
      ListStreamsOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListStreamsInput) = this()
  /* CompleteClass */
  override val input: ListStreamsInput = js.native
  val middlewareStack: MiddlewareStack[ListStreamsInput, ListStreamsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
}

