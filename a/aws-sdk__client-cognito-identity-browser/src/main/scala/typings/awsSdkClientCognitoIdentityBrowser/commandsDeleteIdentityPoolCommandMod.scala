package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentityPoolCommand", "DeleteIdentityPoolCommand")
  @js.native
  open class DeleteIdentityPoolCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteIdentityPoolInput, 
          OutputTypesUnion, 
          DeleteIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DeleteIdentityPoolInput) = this()
    
    /* CompleteClass */
    override val input: DeleteIdentityPoolInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
  }
}
