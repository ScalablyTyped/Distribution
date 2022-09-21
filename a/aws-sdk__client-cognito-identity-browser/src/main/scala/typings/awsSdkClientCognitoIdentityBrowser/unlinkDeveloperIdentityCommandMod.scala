package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typings.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkDeveloperIdentityCommand", "UnlinkDeveloperIdentityCommand")
  @js.native
  open class UnlinkDeveloperIdentityCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UnlinkDeveloperIdentityInput, 
          OutputTypesUnion, 
          UnlinkDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: UnlinkDeveloperIdentityInput) = this()
    
    /* CompleteClass */
    override val input: UnlinkDeveloperIdentityInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
  }
}
