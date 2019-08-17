package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetIdentityPoolRolesCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdentityPoolRolesCommand", "GetIdentityPoolRolesCommand")
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
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
}

