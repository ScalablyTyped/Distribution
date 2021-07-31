package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput
import typings.awsSdkClientKmsBrowser.typesListResourceTagsOutputMod.ListResourceTagsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listResourceTagsCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListResourceTagsCommand", "ListResourceTagsCommand")
  @js.native
  class ListResourceTagsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListResourceTagsInput, 
          OutputTypesUnion, 
          ListResourceTagsOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListResourceTagsInput) = this()
    
    /* CompleteClass */
    override val input: ListResourceTagsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListResourceTagsInput, ListResourceTagsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: js.Any
    ): Handler[ListResourceTagsInput, ListResourceTagsOutput] = js.native
  }
}
