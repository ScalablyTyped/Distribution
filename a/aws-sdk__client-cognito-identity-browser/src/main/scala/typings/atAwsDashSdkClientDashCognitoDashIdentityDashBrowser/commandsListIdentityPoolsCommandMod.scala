package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object commandsListIdentityPoolsCommandMod extends js.Object {
  @js.native
  class ListIdentityPoolsCommand protected () extends Command[
          InputTypesUnion, 
          ListIdentityPoolsInput, 
          OutputTypesUnion, 
          ListIdentityPoolsOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListIdentityPoolsInput) = this()
    /* CompleteClass */
    override val input: ListIdentityPoolsInput = js.native
    val middlewareStack: MiddlewareStack[ListIdentityPoolsInput, ListIdentityPoolsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
  }
  
}

