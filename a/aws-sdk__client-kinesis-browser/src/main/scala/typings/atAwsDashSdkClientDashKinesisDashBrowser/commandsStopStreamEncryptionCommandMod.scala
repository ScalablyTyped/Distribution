package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/StopStreamEncryptionCommand", JSImport.Namespace)
@js.native
object commandsStopStreamEncryptionCommandMod extends js.Object {
  @js.native
  class StopStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StopStreamEncryptionInput, 
          OutputTypesUnion, 
          StopStreamEncryptionOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: StopStreamEncryptionInput) = this()
    /* CompleteClass */
    override val input: StopStreamEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[StopStreamEncryptionInput, StopStreamEncryptionOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
  }
  
}

