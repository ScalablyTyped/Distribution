package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/AddTagsToStreamCommand", JSImport.Namespace)
@js.native
object commandsAddTagsToStreamCommandMod extends js.Object {
  @js.native
  class AddTagsToStreamCommand protected () extends Command[
          InputTypesUnion, 
          AddTagsToStreamInput, 
          OutputTypesUnion, 
          AddTagsToStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: AddTagsToStreamInput) = this()
    /* CompleteClass */
    override val input: AddTagsToStreamInput = js.native
    val middlewareStack: MiddlewareStack[AddTagsToStreamInput, AddTagsToStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
  }
  
}

