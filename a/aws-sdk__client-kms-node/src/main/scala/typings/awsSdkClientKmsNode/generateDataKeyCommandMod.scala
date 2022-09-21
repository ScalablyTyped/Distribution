package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typings.awsSdkClientKmsNode.typesGenerateDataKeyOutputMod.GenerateDataKeyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateDataKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GenerateDataKeyCommand", "GenerateDataKeyCommand")
  @js.native
  open class GenerateDataKeyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GenerateDataKeyInput, 
          OutputTypesUnion, 
          GenerateDataKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GenerateDataKeyInput) = this()
    
    /* CompleteClass */
    override val input: GenerateDataKeyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
  }
}
