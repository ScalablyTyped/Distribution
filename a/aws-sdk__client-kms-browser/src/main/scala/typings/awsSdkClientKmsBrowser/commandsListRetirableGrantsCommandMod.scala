package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
import typings.awsSdkClientKmsBrowser.typesListRetirableGrantsOutputMod.ListRetirableGrantsOutput
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListRetirableGrantsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListRetirableGrantsCommand", "ListRetirableGrantsCommand")
  @js.native
  open class ListRetirableGrantsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListRetirableGrantsInput, 
          OutputTypesUnion, 
          ListRetirableGrantsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListRetirableGrantsInput) = this()
    
    /* CompleteClass */
    override val input: ListRetirableGrantsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ListRetirableGrantsInput, ListRetirableGrantsOutput] = js.native
  }
}
