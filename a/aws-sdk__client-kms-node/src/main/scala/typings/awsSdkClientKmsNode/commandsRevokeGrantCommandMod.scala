package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
import typings.awsSdkClientKmsNode.typesRevokeGrantOutputMod.RevokeGrantOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRevokeGrantCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/RevokeGrantCommand", "RevokeGrantCommand")
  @js.native
  open class RevokeGrantCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RevokeGrantInput, 
          OutputTypesUnion, 
          RevokeGrantOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: RevokeGrantInput) = this()
    
    /* CompleteClass */
    override val input: RevokeGrantInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RevokeGrantInput, RevokeGrantOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  }
}
