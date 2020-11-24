package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentCommand", JSImport.Namespace)
@js.native
object getSegmentCommandMod extends js.Object {
  
  @js.native
  class GetSegmentCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentInput, 
          OutputTypesUnion, 
          GetSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSegmentInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentInput, GetSegmentOutput] = js.native
  }
}
