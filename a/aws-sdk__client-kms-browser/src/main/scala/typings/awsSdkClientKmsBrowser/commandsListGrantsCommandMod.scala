package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput
import typings.awsSdkClientKmsBrowser.typesListGrantsOutputMod.ListGrantsOutput
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListGrantsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListGrantsCommand", "ListGrantsCommand")
  @js.native
  open class ListGrantsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListGrantsInput, 
          OutputTypesUnion, 
          ListGrantsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListGrantsInput) = this()
    
    /* CompleteClass */
    override val input: ListGrantsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListGrantsInput, ListGrantsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ListGrantsInput, ListGrantsOutput] = js.native
  }
}
