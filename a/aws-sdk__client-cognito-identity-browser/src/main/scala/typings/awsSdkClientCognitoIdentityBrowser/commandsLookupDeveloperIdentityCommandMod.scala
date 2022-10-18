package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsLookupDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
  @js.native
  open class LookupDeveloperIdentityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          LookupDeveloperIdentityInput, 
          OutputTypesUnion, 
          LookupDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: LookupDeveloperIdentityInput) = this()
    
    /* CompleteClass */
    override val input: LookupDeveloperIdentityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
  }
}
