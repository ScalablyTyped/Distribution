package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesCompleteVaultLockInputMod.CompleteVaultLockInput
import typings.awsSdkClientGlacierNode.typesCompleteVaultLockOutputMod.CompleteVaultLockOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCompleteVaultLockCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/CompleteVaultLockCommand", "CompleteVaultLockCommand")
  @js.native
  open class CompleteVaultLockCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CompleteVaultLockInput, 
          OutputTypesUnion, 
          CompleteVaultLockOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: CompleteVaultLockInput) = this()
    
    /* CompleteClass */
    override val input: CompleteVaultLockInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CompleteVaultLockInput, CompleteVaultLockOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteVaultLockInput, CompleteVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[CompleteVaultLockInput, CompleteVaultLockOutput] = js.native
  }
}
