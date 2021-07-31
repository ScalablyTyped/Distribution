package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
import typings.awsSdkClientKmsNode.typesDisableKeyOutputMod.DisableKeyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/DisableKeyCommand", "DisableKeyCommand")
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
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
