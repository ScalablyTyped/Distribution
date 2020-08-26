package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/SetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object setIdentityPoolRolesCommandMod extends js.Object {
  @js.native
  class SetIdentityPoolRolesCommand protected () extends Command[
          InputTypesUnion, 
          SetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          SetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: SetIdentityPoolRolesInput) = this()
    val middlewareStack: MiddlewareStack[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
  }
  
}

