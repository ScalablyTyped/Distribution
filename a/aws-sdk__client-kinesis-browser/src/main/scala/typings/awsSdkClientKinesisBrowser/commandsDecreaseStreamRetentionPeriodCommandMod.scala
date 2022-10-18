package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
import typings.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDecreaseStreamRetentionPeriodCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DecreaseStreamRetentionPeriodCommand", "DecreaseStreamRetentionPeriodCommand")
  @js.native
  open class DecreaseStreamRetentionPeriodCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DecreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          DecreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DecreaseStreamRetentionPeriodInput) = this()
    
    /* CompleteClass */
    override val input: DecreaseStreamRetentionPeriodInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
  }
}
