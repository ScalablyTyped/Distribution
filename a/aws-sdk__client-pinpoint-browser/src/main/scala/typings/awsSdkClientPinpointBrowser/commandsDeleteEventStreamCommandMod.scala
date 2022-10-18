package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
import typings.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteEventStreamCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEventStreamCommand", "DeleteEventStreamCommand")
  @js.native
  open class DeleteEventStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteEventStreamInput, 
          OutputTypesUnion, 
          DeleteEventStreamOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteEventStreamInput) = this()
    
    /* CompleteClass */
    override val input: DeleteEventStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
  }
}
