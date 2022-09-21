package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typings.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentitiesCommand", "DeleteIdentitiesCommand")
  @js.native
  open class DeleteIdentitiesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteIdentitiesInput, 
          OutputTypesUnion, 
          DeleteIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DeleteIdentitiesInput) = this()
    
    /* CompleteClass */
    override val input: DeleteIdentitiesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
  }
}
