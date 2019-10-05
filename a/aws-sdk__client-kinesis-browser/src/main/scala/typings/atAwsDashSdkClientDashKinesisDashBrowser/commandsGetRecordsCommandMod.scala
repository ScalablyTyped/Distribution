package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsInputMod.GetRecordsInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesGetRecordsOutputMod.GetRecordsOutput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetRecordsCommand", JSImport.Namespace)
@js.native
object commandsGetRecordsCommandMod extends js.Object {
  @js.native
  class GetRecordsCommand protected () extends Command[
          InputTypesUnion, 
          GetRecordsInput, 
          OutputTypesUnion, 
          GetRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetRecordsInput) = this()
    /* CompleteClass */
    override val input: GetRecordsInput = js.native
    val middlewareStack: MiddlewareStack[GetRecordsInput, GetRecordsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
  }
  
}

