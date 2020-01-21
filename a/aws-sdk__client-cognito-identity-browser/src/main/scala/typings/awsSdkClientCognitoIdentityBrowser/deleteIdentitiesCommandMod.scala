package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentitiesCommand", JSImport.Namespace)
@js.native
object deleteIdentitiesCommandMod extends js.Object {
  @js.native
  class DeleteIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          DeleteIdentitiesInput, 
          OutputTypesUnion, 
          DeleteIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteIdentitiesInput) = this()
    /* CompleteClass */
    override val input: DeleteIdentitiesInput = js.native
    val middlewareStack: MiddlewareStack[DeleteIdentitiesInput, DeleteIdentitiesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
  }
  
}

