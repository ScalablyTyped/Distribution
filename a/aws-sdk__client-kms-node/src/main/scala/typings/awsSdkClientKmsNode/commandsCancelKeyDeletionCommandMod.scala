package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typings.awsSdkClientKmsNode.typesCancelKeyDeletionOutputMod.CancelKeyDeletionOutput
import typings.awsSdkClientKmsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCancelKeyDeletionCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/CancelKeyDeletionCommand", "CancelKeyDeletionCommand")
  @js.native
  open class CancelKeyDeletionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CancelKeyDeletionInput, 
          OutputTypesUnion, 
          CancelKeyDeletionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CancelKeyDeletionInput) = this()
    
    /* CompleteClass */
    override val input: CancelKeyDeletionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
  }
}
