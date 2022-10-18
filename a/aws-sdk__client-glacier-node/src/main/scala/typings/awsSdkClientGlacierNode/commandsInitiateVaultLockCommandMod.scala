package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typings.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsInitiateVaultLockCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/InitiateVaultLockCommand", "InitiateVaultLockCommand")
  @js.native
  open class InitiateVaultLockCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          InitiateVaultLockInput, 
          OutputTypesUnion, 
          InitiateVaultLockOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: InitiateVaultLockInput) = this()
    
    /* CompleteClass */
    override val input: InitiateVaultLockInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
  }
}
