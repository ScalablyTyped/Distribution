package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateDataKeyWithoutPlaintextCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GenerateDataKeyWithoutPlaintextCommand", "GenerateDataKeyWithoutPlaintextCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
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
