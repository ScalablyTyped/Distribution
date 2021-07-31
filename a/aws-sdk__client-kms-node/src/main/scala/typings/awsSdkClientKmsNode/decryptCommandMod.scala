package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
import typings.awsSdkClientKmsNode.typesDecryptOutputMod.DecryptOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/DecryptCommand", "DecryptCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
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
