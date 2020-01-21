package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenCommandMod extends js.Object {
  @js.native
  class GetOpenIdTokenCommand protected () extends Command[
          InputTypesUnion, 
          GetOpenIdTokenInput, 
          OutputTypesUnion, 
          GetOpenIdTokenOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetOpenIdTokenInput) = this()
    /* CompleteClass */
    override val input: GetOpenIdTokenInput = js.native
    val middlewareStack: MiddlewareStack[GetOpenIdTokenInput, GetOpenIdTokenOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
  }
  
}

