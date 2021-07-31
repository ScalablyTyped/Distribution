package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
import typings.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/CreateStreamCommand", "CreateStreamCommand")
  @js.native
  class CreateStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateStreamInput, 
          OutputTypesUnion, 
          CreateStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: CreateStreamInput) = this()
    
    /* CompleteClass */
    override val input: CreateStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateStreamInput, CreateStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: js.Any
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
  }
}
