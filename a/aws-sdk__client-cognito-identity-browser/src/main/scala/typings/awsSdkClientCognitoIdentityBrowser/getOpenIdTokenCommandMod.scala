package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenCommandMod extends js.Object {
  
  @js.native
  class GetOpenIdTokenCommand protected () extends Command[
          InputTypesUnion, 
          GetOpenIdTokenInput, 
          OutputTypesUnion, 
          GetOpenIdTokenOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetOpenIdTokenInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
  }
}
