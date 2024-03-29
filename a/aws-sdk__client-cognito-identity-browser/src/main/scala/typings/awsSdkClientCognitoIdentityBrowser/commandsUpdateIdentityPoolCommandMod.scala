package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/UpdateIdentityPoolCommand", "UpdateIdentityPoolCommand")
  @js.native
  open class UpdateIdentityPoolCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateIdentityPoolInput, 
          OutputTypesUnion, 
          UpdateIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: UpdateIdentityPoolInput) = this()
    
    /* CompleteClass */
    override val input: UpdateIdentityPoolInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
  }
}
