package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typings.awsSdkClientGlacierNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setVaultNotificationsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/SetVaultNotificationsCommand", "SetVaultNotificationsCommand")
  @js.native
  class SetVaultNotificationsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SetVaultNotificationsInput, 
          OutputTypesUnion, 
          SetVaultNotificationsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: SetVaultNotificationsInput) = this()
    
    /* CompleteClass */
    override val input: SetVaultNotificationsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
  }
}
