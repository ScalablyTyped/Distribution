package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DeleteStreamCommand", "DeleteStreamCommand")
  @js.native
  class DeleteStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteStreamInput, 
          OutputTypesUnion, 
          DeleteStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DeleteStreamInput) = this()
    
    /* CompleteClass */
    override val input: DeleteStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteStreamInput, DeleteStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
  }
}
