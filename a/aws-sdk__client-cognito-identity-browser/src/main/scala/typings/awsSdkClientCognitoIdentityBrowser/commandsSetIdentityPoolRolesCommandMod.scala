package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSetIdentityPoolRolesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/SetIdentityPoolRolesCommand", "SetIdentityPoolRolesCommand")
  @js.native
  open class SetIdentityPoolRolesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          SetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: SetIdentityPoolRolesInput) = this()
    
    /* CompleteClass */
    override val input: SetIdentityPoolRolesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
  }
}
