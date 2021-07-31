package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
import typings.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableEnhancedMonitoringCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DisableEnhancedMonitoringCommand", "DisableEnhancedMonitoringCommand")
  @js.native
  class DisableEnhancedMonitoringCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DisableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          DisableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DisableEnhancedMonitoringInput) = this()
    
    /* CompleteClass */
    override val input: DisableEnhancedMonitoringInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
  }
}
