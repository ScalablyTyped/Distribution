package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityOutputMod.DescribeIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityCommand", "DescribeIdentityCommand")
  @js.native
  open class DescribeIdentityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeIdentityInput, 
          OutputTypesUnion, 
          DescribeIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DescribeIdentityInput) = this()
    
    /* CompleteClass */
    override val input: DescribeIdentityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeIdentityInput, DescribeIdentityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityInput, DescribeIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[DescribeIdentityInput, DescribeIdentityOutput] = js.native
  }
}
