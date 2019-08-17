package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsCreateIdentityPoolCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/CreateIdentityPoolCommand", "CreateIdentityPoolCommand")
@js.native
class CreateIdentityPoolCommand protected () extends Command[
      InputTypesUnion, 
      CreateIdentityPoolInput, 
      OutputTypesUnion, 
      CreateIdentityPoolOutput, 
      CognitoIdentityResolvedConfiguration, 
      Blob
    ] {
  def this(input: CreateIdentityPoolInput) = this()
  /* CompleteClass */
  override val input: CreateIdentityPoolInput = js.native
  val middlewareStack: MiddlewareStack[CreateIdentityPoolInput, CreateIdentityPoolOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
}

