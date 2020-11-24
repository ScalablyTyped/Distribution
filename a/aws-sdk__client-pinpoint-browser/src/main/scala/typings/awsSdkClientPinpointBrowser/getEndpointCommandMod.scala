package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
import typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEndpointCommand", JSImport.Namespace)
@js.native
object getEndpointCommandMod extends js.Object {
  
  @js.native
  class GetEndpointCommand protected () extends Command[
          InputTypesUnion, 
          GetEndpointInput, 
          OutputTypesUnion, 
          GetEndpointOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetEndpointInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
  }
}
