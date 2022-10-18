package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetSegmentVersionCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionCommand", "GetSegmentVersionCommand")
  @js.native
  open class GetSegmentVersionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSegmentVersionInput, 
          OutputTypesUnion, 
          GetSegmentVersionOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSegmentVersionInput) = this()
    
    /* CompleteClass */
    override val input: GetSegmentVersionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
  }
}
