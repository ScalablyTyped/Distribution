package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetOpenIdTokenForDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenForDeveloperIdentityCommand", "GetOpenIdTokenForDeveloperIdentityCommand")
  @js.native
  open class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetOpenIdTokenForDeveloperIdentityInput, 
          OutputTypesUnion, 
          GetOpenIdTokenForDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
    
    /* CompleteClass */
    override val input: GetOpenIdTokenForDeveloperIdentityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
  }
}
