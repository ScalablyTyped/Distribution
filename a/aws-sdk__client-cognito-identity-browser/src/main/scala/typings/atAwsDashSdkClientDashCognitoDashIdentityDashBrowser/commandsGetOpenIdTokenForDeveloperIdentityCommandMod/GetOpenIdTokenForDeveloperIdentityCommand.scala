package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetOpenIdTokenForDeveloperIdentityCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenForDeveloperIdentityCommand", "GetOpenIdTokenForDeveloperIdentityCommand")
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
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
}

