package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startStreamEncryptionCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/StartStreamEncryptionCommand", "StartStreamEncryptionCommand")
  @js.native
  open class StartStreamEncryptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          StartStreamEncryptionInput, 
          OutputTypesUnion, 
          StartStreamEncryptionOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: StartStreamEncryptionInput) = this()
    
    /* CompleteClass */
    override val input: StartStreamEncryptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
  }
}
