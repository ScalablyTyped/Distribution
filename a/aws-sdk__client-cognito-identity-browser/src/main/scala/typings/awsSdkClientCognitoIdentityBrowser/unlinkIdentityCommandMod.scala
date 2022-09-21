package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkIdentityCommand", "UnlinkIdentityCommand")
  @js.native
  open class UnlinkIdentityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UnlinkIdentityInput, 
          OutputTypesUnion, 
          UnlinkIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: UnlinkIdentityInput) = this()
    
    /* CompleteClass */
    override val input: UnlinkIdentityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
  }
}
