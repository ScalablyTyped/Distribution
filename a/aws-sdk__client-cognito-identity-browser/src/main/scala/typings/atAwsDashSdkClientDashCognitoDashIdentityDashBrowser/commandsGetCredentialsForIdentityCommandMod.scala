package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetCredentialsForIdentityCommand", JSImport.Namespace)
@js.native
object commandsGetCredentialsForIdentityCommandMod extends js.Object {
  @js.native
  class GetCredentialsForIdentityCommand protected () extends Command[
          InputTypesUnion, 
          GetCredentialsForIdentityInput, 
          OutputTypesUnion, 
          GetCredentialsForIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCredentialsForIdentityInput) = this()
    /* CompleteClass */
    override val input: GetCredentialsForIdentityInput = js.native
    val middlewareStack: MiddlewareStack[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
  }
  
}

