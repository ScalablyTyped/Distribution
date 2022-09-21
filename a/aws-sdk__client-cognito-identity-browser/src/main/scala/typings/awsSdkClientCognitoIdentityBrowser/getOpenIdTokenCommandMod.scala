package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOpenIdTokenCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenCommand", "GetOpenIdTokenCommand")
  @js.native
  open class GetOpenIdTokenCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetOpenIdTokenInput, 
          OutputTypesUnion, 
          GetOpenIdTokenOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetOpenIdTokenInput) = this()
    
    /* CompleteClass */
    override val input: GetOpenIdTokenInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
  }
}
