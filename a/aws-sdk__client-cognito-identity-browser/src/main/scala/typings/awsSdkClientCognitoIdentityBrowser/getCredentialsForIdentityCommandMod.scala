package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetCredentialsForIdentityCommand", JSImport.Namespace)
@js.native
object getCredentialsForIdentityCommandMod extends js.Object {
  @js.native
  class GetCredentialsForIdentityCommand protected () extends Command[
          InputTypesUnion, 
          GetCredentialsForIdentityInput, 
          OutputTypesUnion, 
          GetCredentialsForIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCredentialsForIdentityInput) = this()
    val middlewareStack: MiddlewareStack[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
  }
  
}

