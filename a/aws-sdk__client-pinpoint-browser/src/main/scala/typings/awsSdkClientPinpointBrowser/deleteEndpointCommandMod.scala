package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
import typings.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteEndpointCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEndpointCommand", "DeleteEndpointCommand")
  @js.native
  class DeleteEndpointCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEndpointInput, 
          OutputTypesUnion, 
          DeleteEndpointOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteEndpointInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
  }
}
