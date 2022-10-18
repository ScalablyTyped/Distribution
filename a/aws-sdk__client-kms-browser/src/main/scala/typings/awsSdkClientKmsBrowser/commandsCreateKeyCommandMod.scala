package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput
import typings.awsSdkClientKmsBrowser.typesCreateKeyOutputMod.CreateKeyOutput
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/CreateKeyCommand", "CreateKeyCommand")
  @js.native
  open class CreateKeyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateKeyInput, 
          OutputTypesUnion, 
          CreateKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CreateKeyInput) = this()
    
    /* CompleteClass */
    override val input: CreateKeyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateKeyInput, CreateKeyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
  }
}
