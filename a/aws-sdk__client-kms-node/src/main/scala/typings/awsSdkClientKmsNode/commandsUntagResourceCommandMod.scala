package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput
import typings.awsSdkClientKmsNode.typesUntagResourceOutputMod.UntagResourceOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUntagResourceCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/UntagResourceCommand", "UntagResourceCommand")
  @js.native
  open class UntagResourceCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UntagResourceInput, 
          OutputTypesUnion, 
          UntagResourceOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: UntagResourceInput) = this()
    
    /* CompleteClass */
    override val input: UntagResourceInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  }
}
