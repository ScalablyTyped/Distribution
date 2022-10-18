package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentitiesCommand", "ListIdentitiesCommand")
  @js.native
  open class ListIdentitiesCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
  }
}
