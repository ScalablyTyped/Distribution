package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetSegmentVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionsCommand", "GetSegmentVersionsCommand")
  @js.native
  open class GetSegmentVersionsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSegmentVersionsInput, 
          OutputTypesUnion, 
          GetSegmentVersionsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSegmentVersionsInput) = this()
    
    /* CompleteClass */
    override val input: GetSegmentVersionsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
  }
}
