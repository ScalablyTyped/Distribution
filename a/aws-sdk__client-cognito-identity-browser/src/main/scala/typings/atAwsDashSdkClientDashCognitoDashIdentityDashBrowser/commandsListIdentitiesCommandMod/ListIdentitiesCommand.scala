package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.commandsListIdentitiesCommandMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentitiesCommand", "ListIdentitiesCommand")
@js.native
class ListIdentitiesCommand protected () extends Command[
      InputTypesUnion, 
      ListIdentitiesInput, 
      OutputTypesUnion, 
      ListIdentitiesOutput, 
      CognitoIdentityResolvedConfiguration, 
      Blob
    ] {
  def this(input: ListIdentitiesInput) = this()
  /* CompleteClass */
  override val input: ListIdentitiesInput = js.native
  val middlewareStack: MiddlewareStack[ListIdentitiesInput, ListIdentitiesOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: CognitoIdentityResolvedConfiguration
  ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
}

