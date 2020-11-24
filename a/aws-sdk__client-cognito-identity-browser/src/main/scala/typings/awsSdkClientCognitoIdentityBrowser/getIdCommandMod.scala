package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdCommand", JSImport.Namespace)
@js.native
object getIdCommandMod extends js.Object {
  
  @js.native
  class GetIdCommand protected () extends Command[
          InputTypesUnion, 
          GetIdInput, 
          OutputTypesUnion, 
          GetIdOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetIdInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdInput, GetIdOutput] = js.native
  }
}
