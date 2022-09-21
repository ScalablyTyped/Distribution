package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typings.awsSdkClientGlacierNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortVaultLockCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/AbortVaultLockCommand", "AbortVaultLockCommand")
  @js.native
  open class AbortVaultLockCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          AbortVaultLockInput, 
          OutputTypesUnion, 
          AbortVaultLockOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: AbortVaultLockInput) = this()
    
    /* CompleteClass */
    override val input: AbortVaultLockInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[AbortVaultLockInput, AbortVaultLockOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
  }
}
