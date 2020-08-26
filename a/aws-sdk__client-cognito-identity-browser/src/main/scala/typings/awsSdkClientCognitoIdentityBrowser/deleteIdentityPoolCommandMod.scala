package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentityPoolCommand", JSImport.Namespace)
@js.native
object deleteIdentityPoolCommandMod extends js.Object {
  @js.native
  class DeleteIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          DeleteIdentityPoolInput, 
          OutputTypesUnion, 
          DeleteIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteIdentityPoolInput) = this()
    val middlewareStack: MiddlewareStack[DeleteIdentityPoolInput, DeleteIdentityPoolOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
  }
  
}

