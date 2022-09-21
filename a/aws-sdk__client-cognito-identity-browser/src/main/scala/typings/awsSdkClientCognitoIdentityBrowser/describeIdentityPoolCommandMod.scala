package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityPoolCommand", "DescribeIdentityPoolCommand")
  @js.native
  open class DescribeIdentityPoolCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeIdentityPoolInput, 
          OutputTypesUnion, 
          DescribeIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DescribeIdentityPoolInput) = this()
    
    /* CompleteClass */
    override val input: DescribeIdentityPoolInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
  }
}
