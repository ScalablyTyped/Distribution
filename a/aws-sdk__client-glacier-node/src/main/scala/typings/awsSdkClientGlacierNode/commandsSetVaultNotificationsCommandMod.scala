package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod.SetVaultNotificationsInput
import typings.awsSdkClientGlacierNode.typesSetVaultNotificationsOutputMod.SetVaultNotificationsOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSetVaultNotificationsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/SetVaultNotificationsCommand", "SetVaultNotificationsCommand")
  @js.native
  open class SetVaultNotificationsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[SetVaultNotificationsInput, SetVaultNotificationsOutput] = js.native
  }
}
