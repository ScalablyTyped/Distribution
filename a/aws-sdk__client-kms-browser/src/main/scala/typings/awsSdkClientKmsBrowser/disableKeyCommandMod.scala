package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput
import typings.awsSdkClientKmsBrowser.typesDisableKeyOutputMod.DisableKeyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyCommand", "DisableKeyCommand")
  @js.native
  class DisableKeyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DisableKeyInput, 
          OutputTypesUnion, 
          DisableKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DisableKeyInput) = this()
    
    /* CompleteClass */
    override val input: DisableKeyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DisableKeyInput, DisableKeyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[DisableKeyInput, DisableKeyOutput] = js.native
  }
}
