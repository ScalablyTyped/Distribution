package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityCommand", JSImport.Namespace)
@js.native
object describeIdentityCommandMod extends js.Object {
  @js.native
  class DescribeIdentityCommand protected () extends Command[
          InputTypesUnion, 
          DescribeIdentityInput, 
          OutputTypesUnion, 
          DescribeIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeIdentityInput) = this()
    val middlewareStack: MiddlewareStack[DescribeIdentityInput, DescribeIdentityOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityInput, DescribeIdentityOutput] = js.native
  }
  
}

