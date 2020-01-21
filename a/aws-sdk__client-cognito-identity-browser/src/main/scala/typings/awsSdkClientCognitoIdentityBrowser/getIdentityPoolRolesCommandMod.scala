package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object getIdentityPoolRolesCommandMod extends js.Object {
  @js.native
  class GetIdentityPoolRolesCommand protected () extends Command[
          InputTypesUnion, 
          GetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          GetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetIdentityPoolRolesInput) = this()
    /* CompleteClass */
    override val input: GetIdentityPoolRolesInput = js.native
    val middlewareStack: MiddlewareStack[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
  }
  
}

