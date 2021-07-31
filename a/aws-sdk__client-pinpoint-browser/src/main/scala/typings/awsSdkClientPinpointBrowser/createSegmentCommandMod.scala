package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
import typings.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSegmentCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateSegmentCommand", "CreateSegmentCommand")
  @js.native
  class CreateSegmentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateSegmentInput, 
          OutputTypesUnion, 
          CreateSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateSegmentInput) = this()
    
    /* CompleteClass */
    override val input: CreateSegmentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateSegmentInput, CreateSegmentOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
  }
}
