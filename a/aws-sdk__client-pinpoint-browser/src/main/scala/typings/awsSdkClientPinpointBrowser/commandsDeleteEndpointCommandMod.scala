package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
import typings.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteEndpointCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEndpointCommand", "DeleteEndpointCommand")
  @js.native
  open class DeleteEndpointCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteEndpointInput, 
          OutputTypesUnion, 
          DeleteEndpointOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteEndpointInput) = this()
    
    /* CompleteClass */
    override val input: DeleteEndpointInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteEndpointInput, DeleteEndpointOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
  }
}
