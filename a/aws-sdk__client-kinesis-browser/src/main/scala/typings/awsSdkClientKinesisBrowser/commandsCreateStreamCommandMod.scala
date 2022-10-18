package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
import typings.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput
import typings.awsSdkClientKinesisBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/CreateStreamCommand", "CreateStreamCommand")
  @js.native
  open class CreateStreamCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KinesisResolvedConfiguration,
      options: Any
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
  }
}
