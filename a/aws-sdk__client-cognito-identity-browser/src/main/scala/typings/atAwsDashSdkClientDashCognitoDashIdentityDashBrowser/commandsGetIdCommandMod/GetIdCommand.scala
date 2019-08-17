package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsGetIdCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdInputMod.GetIdInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdOutputMod.GetIdOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdCommand", "GetIdCommand")
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
  /* CompleteClass */
  override val input: GetIdInput = js.native
  val middlewareStack: MiddlewareStack[GetIdInput, GetIdOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[GetIdInput, GetIdOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[GetIdInput, GetIdOutput] = js.native
}

