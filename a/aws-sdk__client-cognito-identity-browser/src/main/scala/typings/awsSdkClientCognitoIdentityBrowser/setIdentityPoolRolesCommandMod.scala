package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setIdentityPoolRolesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/SetIdentityPoolRolesCommand", "SetIdentityPoolRolesCommand")
  @js.native
  class SetIdentityPoolRolesCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: js.Any
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
  }
}
