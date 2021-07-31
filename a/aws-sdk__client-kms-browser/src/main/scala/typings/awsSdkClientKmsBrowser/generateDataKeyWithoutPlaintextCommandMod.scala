package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateDataKeyWithoutPlaintextCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyWithoutPlaintextCommand", "GenerateDataKeyWithoutPlaintextCommand")
  @js.native
  class GenerateDataKeyWithoutPlaintextCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
  }
}
