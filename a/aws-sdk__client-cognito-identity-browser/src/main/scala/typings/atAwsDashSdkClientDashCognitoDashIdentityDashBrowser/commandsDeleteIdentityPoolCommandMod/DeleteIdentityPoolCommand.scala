package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsDeleteIdentityPoolCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentityPoolCommand", "DeleteIdentityPoolCommand")
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
  /* CompleteClass */
  override val input: DeleteIdentityPoolInput = js.native
  val middlewareStack: MiddlewareStack[DeleteIdentityPoolInput, DeleteIdentityPoolOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
}

