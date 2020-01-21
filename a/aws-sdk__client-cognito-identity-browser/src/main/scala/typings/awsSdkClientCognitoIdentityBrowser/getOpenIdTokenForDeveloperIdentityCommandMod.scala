package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenForDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenForDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          GetOpenIdTokenForDeveloperIdentityInput, 
          OutputTypesUnion, 
          GetOpenIdTokenForDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: GetOpenIdTokenForDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        GetOpenIdTokenForDeveloperIdentityInput, 
        GetOpenIdTokenForDeveloperIdentityOutput, 
        Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
  }
  
}

