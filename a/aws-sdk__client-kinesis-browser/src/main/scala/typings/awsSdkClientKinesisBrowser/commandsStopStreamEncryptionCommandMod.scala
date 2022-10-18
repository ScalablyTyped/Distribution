package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
import typings.awsSdkClientKinesisBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsStopStreamEncryptionCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/StopStreamEncryptionCommand", "StopStreamEncryptionCommand")
  @js.native
  open class StopStreamEncryptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          StopStreamEncryptionInput, 
          OutputTypesUnion, 
          StopStreamEncryptionOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: StopStreamEncryptionInput) = this()
    
    /* CompleteClass */
    override val input: StopStreamEncryptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
  }
}
