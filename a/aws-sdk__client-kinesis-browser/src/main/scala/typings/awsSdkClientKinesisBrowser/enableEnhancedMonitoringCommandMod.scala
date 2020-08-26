package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/EnableEnhancedMonitoringCommand", JSImport.Namespace)
@js.native
object enableEnhancedMonitoringCommandMod extends js.Object {
  @js.native
  class EnableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          EnableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          EnableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: EnableEnhancedMonitoringInput) = this()
    val middlewareStack: MiddlewareStack[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
  }
  
}

