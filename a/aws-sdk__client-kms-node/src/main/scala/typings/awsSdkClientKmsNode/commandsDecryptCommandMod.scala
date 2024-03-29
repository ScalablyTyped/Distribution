package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
import typings.awsSdkClientKmsNode.typesDecryptOutputMod.DecryptOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDecryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/DecryptCommand", "DecryptCommand")
  @js.native
  open class DecryptCommand protected ()
    extends StObject
       with Command[InputTypesUnion, DecryptInput, OutputTypesUnion, DecryptOutput, KMSResolvedConfiguration] {
    def this(input: DecryptInput) = this()
    
    /* CompleteClass */
    override val input: DecryptInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DecryptInput, DecryptOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[DecryptInput, DecryptOutput] = js.native
  }
}
