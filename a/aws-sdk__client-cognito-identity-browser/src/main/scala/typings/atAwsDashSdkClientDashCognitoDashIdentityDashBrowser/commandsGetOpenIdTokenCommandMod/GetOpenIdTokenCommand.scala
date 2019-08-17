package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetOpenIdTokenCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenCommand", "GetOpenIdTokenCommand")
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
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
}

