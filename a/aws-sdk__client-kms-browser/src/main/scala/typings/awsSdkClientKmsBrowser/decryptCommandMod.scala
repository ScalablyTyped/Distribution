package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput
import typings.awsSdkClientKmsBrowser.typesDecryptOutputMod.DecryptOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DecryptCommand", "DecryptCommand")
  @js.native
  class DecryptCommand protected ()
    extends StObject
       with Command[InputTypesUnion, DecryptInput, OutputTypesUnion, DecryptOutput, KMSResolvedConfiguration] {
    def this(input: DecryptInput) = this()
    
    /* CompleteClass */
    override val input: DecryptInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DecryptInput, DecryptOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[DecryptInput, DecryptOutput] = js.native
  }
}
