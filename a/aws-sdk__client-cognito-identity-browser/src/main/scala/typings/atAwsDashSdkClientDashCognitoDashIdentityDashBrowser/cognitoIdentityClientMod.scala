package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/CognitoIdentityClient", JSImport.Namespace)
@js.native
object cognitoIdentityClientMod extends js.Object {
  @js.native
  class CognitoIdentityClient protected () extends js.Object {
    def this(configuration: CognitoIdentityConfiguration) = this()
    val config: CognitoIdentityResolvedConfiguration = js.native
    val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob] = js.native
    def destroy(): Unit = js.native
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
  
}

