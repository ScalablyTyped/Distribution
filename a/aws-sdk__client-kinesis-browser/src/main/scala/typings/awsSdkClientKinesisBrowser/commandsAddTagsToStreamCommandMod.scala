package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
import typings.awsSdkClientKinesisBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsAddTagsToStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/AddTagsToStreamCommand", "AddTagsToStreamCommand")
  @js.native
  open class AddTagsToStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          AddTagsToStreamInput, 
          OutputTypesUnion, 
          AddTagsToStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: AddTagsToStreamInput) = this()
    
    /* CompleteClass */
    override val input: AddTagsToStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
  }
}
