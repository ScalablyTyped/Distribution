package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
import typings.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsIncreaseStreamRetentionPeriodCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/IncreaseStreamRetentionPeriodCommand", "IncreaseStreamRetentionPeriodCommand")
  @js.native
  open class IncreaseStreamRetentionPeriodCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          IncreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          IncreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: IncreaseStreamRetentionPeriodInput) = this()
    
    /* CompleteClass */
    override val input: IncreaseStreamRetentionPeriodInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
  }
}
