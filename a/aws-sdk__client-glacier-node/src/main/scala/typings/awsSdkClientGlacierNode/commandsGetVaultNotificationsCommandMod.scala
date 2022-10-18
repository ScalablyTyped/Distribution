package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
import typings.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod.GetVaultNotificationsOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetVaultNotificationsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/GetVaultNotificationsCommand", "GetVaultNotificationsCommand")
  @js.native
  open class GetVaultNotificationsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetVaultNotificationsInput, 
          OutputTypesUnion, 
          GetVaultNotificationsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetVaultNotificationsInput) = this()
    
    /* CompleteClass */
    override val input: GetVaultNotificationsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
  }
}
