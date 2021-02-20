package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableEnhancedMonitoringCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/EnableEnhancedMonitoringCommand", "EnableEnhancedMonitoringCommand")
  @js.native
  class EnableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          EnableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          EnableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: EnableEnhancedMonitoringInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
  }
}
