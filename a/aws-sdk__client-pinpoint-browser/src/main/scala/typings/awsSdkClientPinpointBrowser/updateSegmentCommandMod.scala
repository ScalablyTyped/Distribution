package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
import typings.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateSegmentCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSegmentCommand", "UpdateSegmentCommand")
  @js.native
  class UpdateSegmentCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSegmentInput, 
          OutputTypesUnion, 
          UpdateSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateSegmentInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
  }
}
