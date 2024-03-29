package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
import typings.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsEnableEnhancedMonitoringCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/EnableEnhancedMonitoringCommand", "EnableEnhancedMonitoringCommand")
  @js.native
  open class EnableEnhancedMonitoringCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          EnableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          EnableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: EnableEnhancedMonitoringInput) = this()
    
    /* CompleteClass */
    override val input: EnableEnhancedMonitoringInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
  }
}
