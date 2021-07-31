package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentitiesCommand", "ListIdentitiesCommand")
  @js.native
  class ListIdentitiesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListIdentitiesInput, 
          OutputTypesUnion, 
          ListIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: ListIdentitiesInput) = this()
    
    /* CompleteClass */
    override val input: ListIdentitiesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListIdentitiesInput, ListIdentitiesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: js.Any
    ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
  }
}
