package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object listIdentityPoolsCommandMod extends js.Object {
  @js.native
  class ListIdentityPoolsCommand protected () extends Command[
          InputTypesUnion, 
          ListIdentityPoolsInput, 
          OutputTypesUnion, 
          ListIdentityPoolsOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListIdentityPoolsInput) = this()
    val middlewareStack: MiddlewareStack[ListIdentityPoolsInput, ListIdentityPoolsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
  }
  
}

