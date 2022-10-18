package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesDeleteVaultInputMod.DeleteVaultInput
import typings.awsSdkClientGlacierNode.typesDeleteVaultOutputMod.DeleteVaultOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultCommand", "DeleteVaultCommand")
  @js.native
  open class DeleteVaultCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteVaultInput, 
          OutputTypesUnion, 
          DeleteVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DeleteVaultInput) = this()
    
    /* CompleteClass */
    override val input: DeleteVaultInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteVaultInput, DeleteVaultOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[DeleteVaultInput, DeleteVaultOutput] = js.native
  }
}
