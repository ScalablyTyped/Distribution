package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput
import typings.awsSdkClientKmsBrowser.typesEnableKeyOutputMod.EnableKeyOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsEnableKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/EnableKeyCommand", "EnableKeyCommand")
  @js.native
  open class EnableKeyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          EnableKeyInput, 
          OutputTypesUnion, 
          EnableKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: EnableKeyInput) = this()
    
    /* CompleteClass */
    override val input: EnableKeyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[EnableKeyInput, EnableKeyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  }
}
