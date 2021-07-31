package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typings.awsSdkClientCognitoIdentityBrowser.typesGetIdOutputMod.GetIdOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIdCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdCommand", "GetIdCommand")
  @js.native
  class GetIdCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetIdInput, 
          OutputTypesUnion, 
          GetIdOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetIdInput) = this()
    
    /* CompleteClass */
    override val input: GetIdInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetIdInput, GetIdOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdInput, GetIdOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: js.Any
    ): Handler[GetIdInput, GetIdOutput] = js.native
  }
}
