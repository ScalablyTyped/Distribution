package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typings.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/CreateIdentityPoolCommand", "CreateIdentityPoolCommand")
  @js.native
  open class CreateIdentityPoolCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateIdentityPoolInput, 
          OutputTypesUnion, 
          CreateIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: CreateIdentityPoolInput) = this()
    
    /* CompleteClass */
    override val input: CreateIdentityPoolInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
  }
}
