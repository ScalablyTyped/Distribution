package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsLookupDeveloperIdentityCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
@js.native
class LookupDeveloperIdentityCommand protected () extends Command[
      InputTypesUnion, 
      LookupDeveloperIdentityInput, 
      OutputTypesUnion, 
      LookupDeveloperIdentityOutput, 
      CognitoIdentityResolvedConfiguration, 
      Blob
    ] {
  def this(input: LookupDeveloperIdentityInput) = this()
  /* CompleteClass */
  override val input: LookupDeveloperIdentityInput = js.native
  val middlewareStack: MiddlewareStack[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
}

