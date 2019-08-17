package typings.atAwsDashSdkClientDashKinesisDashBrowser.commandsListShardsCommandMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListShardsInputMod.ListShardsInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListShardsOutputMod.ListShardsOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListShardsCommand", "ListShardsCommand")
@js.native
class ListShardsCommand protected () extends Command[
      InputTypesUnion, 
      ListShardsInput, 
      OutputTypesUnion, 
      ListShardsOutput, 
      KinesisResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListShardsInput) = this()
  /* CompleteClass */
  override val input: ListShardsInput = js.native
  val middlewareStack: MiddlewareStack[ListShardsInput, ListShardsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[ListShardsInput, ListShardsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KinesisResolvedConfiguration
  ): Handler[ListShardsInput, ListShardsOutput] = js.native
}

