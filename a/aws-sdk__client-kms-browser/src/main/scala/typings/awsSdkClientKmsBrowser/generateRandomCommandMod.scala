package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput
import typings.awsSdkClientKmsBrowser.typesGenerateRandomOutputMod.GenerateRandomOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateRandomCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GenerateRandomCommand", "GenerateRandomCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
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
