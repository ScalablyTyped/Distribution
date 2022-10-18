package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput
import typings.awsSdkClientKmsNode.typesGenerateRandomOutputMod.GenerateRandomOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGenerateRandomCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/GenerateRandomCommand", "GenerateRandomCommand")
  @js.native
  open class GenerateRandomCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GenerateRandomInput, 
          OutputTypesUnion, 
          GenerateRandomOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: GenerateRandomInput) = this()
    
    /* CompleteClass */
    override val input: GenerateRandomInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GenerateRandomInput, GenerateRandomOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[GenerateRandomInput, GenerateRandomOutput] = js.native
  }
}
