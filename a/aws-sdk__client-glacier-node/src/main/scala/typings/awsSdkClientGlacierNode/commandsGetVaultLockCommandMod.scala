package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
import typings.awsSdkClientGlacierNode.typesGetVaultLockOutputMod.GetVaultLockOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetVaultLockCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/GetVaultLockCommand", "GetVaultLockCommand")
  @js.native
  open class GetVaultLockCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetVaultLockInput, 
          OutputTypesUnion, 
          GetVaultLockOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetVaultLockInput) = this()
    
    /* CompleteClass */
    override val input: GetVaultLockInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetVaultLockInput, GetVaultLockOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
  }
}
