package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
import typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DisableEnhancedMonitoringCommand", JSImport.Namespace)
@js.native
object disableEnhancedMonitoringCommandMod extends js.Object {
  @js.native
  class DisableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          DisableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          DisableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DisableEnhancedMonitoringInput) = this()
    /* CompleteClass */
    override val input: DisableEnhancedMonitoringInput = js.native
    val middlewareStack: MiddlewareStack[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
  }
  
}

