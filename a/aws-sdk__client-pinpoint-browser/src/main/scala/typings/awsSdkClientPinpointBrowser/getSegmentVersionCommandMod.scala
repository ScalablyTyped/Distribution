package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSegmentVersionCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionCommand", "GetSegmentVersionCommand")
  @js.native
  class GetSegmentVersionCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
  }
}
