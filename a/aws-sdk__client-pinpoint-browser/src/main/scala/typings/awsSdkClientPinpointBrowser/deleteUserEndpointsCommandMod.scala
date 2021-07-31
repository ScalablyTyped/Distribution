package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput
import typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteUserEndpointsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteUserEndpointsCommand", "DeleteUserEndpointsCommand")
  @js.native
  class DeleteUserEndpointsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteUserEndpointsInput, 
          OutputTypesUnion, 
          DeleteUserEndpointsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteUserEndpointsInput) = this()
    
    /* CompleteClass */
    override val input: DeleteUserEndpointsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteUserEndpointsInput, DeleteUserEndpointsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteUserEndpointsInput, DeleteUserEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[DeleteUserEndpointsInput, DeleteUserEndpointsOutput] = js.native
  }
}
