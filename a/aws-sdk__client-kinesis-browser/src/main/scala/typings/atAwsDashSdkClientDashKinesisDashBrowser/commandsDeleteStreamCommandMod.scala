package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDeleteStreamInputMod.DeleteStreamInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeleteStreamCommand", JSImport.Namespace)
@js.native
object commandsDeleteStreamCommandMod extends js.Object {
  @js.native
  class DeleteStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteStreamInput, 
          OutputTypesUnion, 
          DeleteStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteStreamInput) = this()
    /* CompleteClass */
    override val input: DeleteStreamInput = js.native
    val middlewareStack: MiddlewareStack[DeleteStreamInput, DeleteStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
  }
  
}

