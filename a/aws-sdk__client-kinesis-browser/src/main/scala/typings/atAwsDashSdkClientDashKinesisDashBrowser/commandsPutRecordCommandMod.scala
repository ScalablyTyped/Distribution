package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordInputMod.PutRecordInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordOutputMod.PutRecordOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordCommand", JSImport.Namespace)
@js.native
object commandsPutRecordCommandMod extends js.Object {
  @js.native
  class PutRecordCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordInput, 
          OutputTypesUnion, 
          PutRecordOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutRecordInput) = this()
    /* CompleteClass */
    override val input: PutRecordInput = js.native
    val middlewareStack: MiddlewareStack[PutRecordInput, PutRecordOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordInput, PutRecordOutput] = js.native
  }
  
}

