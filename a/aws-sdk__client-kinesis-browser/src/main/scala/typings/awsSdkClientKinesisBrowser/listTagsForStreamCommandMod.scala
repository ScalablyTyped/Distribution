package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
import typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listTagsForStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/ListTagsForStreamCommand", "ListTagsForStreamCommand")
  @js.native
  class ListTagsForStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListTagsForStreamInput, 
          OutputTypesUnion, 
          ListTagsForStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListTagsForStreamInput) = this()
    
    /* CompleteClass */
    override val input: ListTagsForStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
  }
}
