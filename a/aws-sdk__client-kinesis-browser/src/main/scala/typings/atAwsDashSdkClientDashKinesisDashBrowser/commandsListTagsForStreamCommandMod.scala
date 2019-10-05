package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListTagsForStreamCommand", JSImport.Namespace)
@js.native
object commandsListTagsForStreamCommandMod extends js.Object {
  @js.native
  class ListTagsForStreamCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForStreamInput, 
          OutputTypesUnion, 
          ListTagsForStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTagsForStreamInput) = this()
    /* CompleteClass */
    override val input: ListTagsForStreamInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsForStreamInput, ListTagsForStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
  }
  
}

