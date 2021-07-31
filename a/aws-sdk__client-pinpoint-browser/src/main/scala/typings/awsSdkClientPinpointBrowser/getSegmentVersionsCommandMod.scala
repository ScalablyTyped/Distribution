package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSegmentVersionsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionsCommand", "GetSegmentVersionsCommand")
  @js.native
  class GetSegmentVersionsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
  }
}
