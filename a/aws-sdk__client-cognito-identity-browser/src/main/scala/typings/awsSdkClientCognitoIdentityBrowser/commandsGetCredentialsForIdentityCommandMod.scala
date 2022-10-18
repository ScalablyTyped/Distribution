package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCredentialsForIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetCredentialsForIdentityCommand", "GetCredentialsForIdentityCommand")
  @js.native
  open class GetCredentialsForIdentityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCredentialsForIdentityInput, 
          OutputTypesUnion, 
          GetCredentialsForIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetCredentialsForIdentityInput) = this()
    
    /* CompleteClass */
    override val input: GetCredentialsForIdentityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
  }
}
