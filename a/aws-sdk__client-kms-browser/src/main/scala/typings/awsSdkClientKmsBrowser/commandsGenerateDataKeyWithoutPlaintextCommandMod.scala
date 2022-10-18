package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGenerateDataKeyWithoutPlaintextCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyWithoutPlaintextCommand", "GenerateDataKeyWithoutPlaintextCommand")
  @js.native
  open class GenerateDataKeyWithoutPlaintextCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GenerateDataKeyWithoutPlaintextInput, 
          OutputTypesUnion, 
          GenerateDataKeyWithoutPlaintextOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GenerateDataKeyWithoutPlaintextInput) = this()
    
    /* CompleteClass */
    override val input: GenerateDataKeyWithoutPlaintextInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
  }
}
