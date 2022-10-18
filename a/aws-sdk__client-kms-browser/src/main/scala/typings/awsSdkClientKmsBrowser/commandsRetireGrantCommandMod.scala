package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
import typings.awsSdkClientKmsBrowser.typesRetireGrantOutputMod.RetireGrantOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRetireGrantCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/RetireGrantCommand", "RetireGrantCommand")
  @js.native
  open class RetireGrantCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RetireGrantInput, 
          OutputTypesUnion, 
          RetireGrantOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: RetireGrantInput) = this()
    
    /* CompleteClass */
    override val input: RetireGrantInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RetireGrantInput, RetireGrantOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
  }
}
