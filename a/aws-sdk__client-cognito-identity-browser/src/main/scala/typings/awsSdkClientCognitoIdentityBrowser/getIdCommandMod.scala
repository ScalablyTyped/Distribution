package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdCommand", JSImport.Namespace)
@js.native
object getIdCommandMod extends js.Object {
  @js.native
  class GetIdCommand protected () extends Command[
          InputTypesUnion, 
          GetIdInput, 
          OutputTypesUnion, 
          GetIdOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetIdInput) = this()
    val middlewareStack: MiddlewareStack[GetIdInput, GetIdOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdInput, GetIdOutput] = js.native
  }
  
}

