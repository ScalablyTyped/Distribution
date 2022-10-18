package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
import typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRemoveTagsFromStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/RemoveTagsFromStreamCommand", "RemoveTagsFromStreamCommand")
  @js.native
  open class RemoveTagsFromStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RemoveTagsFromStreamInput, 
          OutputTypesUnion, 
          RemoveTagsFromStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: RemoveTagsFromStreamInput) = this()
    
    /* CompleteClass */
    override val input: RemoveTagsFromStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
  }
}
