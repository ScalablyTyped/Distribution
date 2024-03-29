package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesUpdateSegmentInputMod.UpdateSegmentInput
import typings.awsSdkClientPinpointBrowser.typesUpdateSegmentOutputMod.UpdateSegmentOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateSegmentCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSegmentCommand", "UpdateSegmentCommand")
  @js.native
  open class UpdateSegmentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateSegmentInput, 
          OutputTypesUnion, 
          UpdateSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateSegmentInput) = this()
    
    /* CompleteClass */
    override val input: UpdateSegmentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateSegmentInput, UpdateSegmentOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateSegmentInput, UpdateSegmentOutput] = js.native
  }
}
