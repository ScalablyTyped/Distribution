package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyOutputMod.GenerateDataKeyOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGenerateDataKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyCommand", "GenerateDataKeyCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
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
