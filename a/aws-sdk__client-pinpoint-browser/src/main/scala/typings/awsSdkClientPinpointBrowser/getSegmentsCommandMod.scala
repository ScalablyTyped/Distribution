package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput
import typings.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSegmentsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentsCommand", "GetSegmentsCommand")
  @js.native
  class GetSegmentsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetSegmentsInput, 
          OutputTypesUnion, 
          GetSegmentsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSegmentsInput) = this()
    
    /* CompleteClass */
    override val input: GetSegmentsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetSegmentsInput, GetSegmentsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
  }
}
