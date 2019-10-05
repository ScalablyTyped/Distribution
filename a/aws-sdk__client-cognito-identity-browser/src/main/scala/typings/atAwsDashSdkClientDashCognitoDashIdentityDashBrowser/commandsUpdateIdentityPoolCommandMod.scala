package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UpdateIdentityPoolCommand", JSImport.Namespace)
@js.native
object commandsUpdateIdentityPoolCommandMod extends js.Object {
  @js.native
  class UpdateIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          UpdateIdentityPoolInput, 
          OutputTypesUnion, 
          UpdateIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateIdentityPoolInput) = this()
    /* CompleteClass */
    override val input: UpdateIdentityPoolInput = js.native
    val middlewareStack: MiddlewareStack[UpdateIdentityPoolInput, UpdateIdentityPoolOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
  }
  
}

