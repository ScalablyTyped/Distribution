package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput
import typings.awsSdkClientKmsNode.typesEncryptOutputMod.EncryptOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsEncryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/EncryptCommand", "EncryptCommand")
  @js.native
  open class EncryptCommand protected ()
    extends StObject
       with Command[InputTypesUnion, EncryptInput, OutputTypesUnion, EncryptOutput, KMSResolvedConfiguration] {
    def this(input: EncryptInput) = this()
    
    /* CompleteClass */
    override val input: EncryptInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[EncryptInput, EncryptOutput] = js.native
  }
}
