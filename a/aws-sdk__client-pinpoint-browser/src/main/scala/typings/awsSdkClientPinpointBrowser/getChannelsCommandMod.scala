package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
import typings.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getChannelsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetChannelsCommand", "GetChannelsCommand")
  @js.native
  class GetChannelsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetChannelsInput, 
          OutputTypesUnion, 
          GetChannelsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetChannelsInput) = this()
    
    /* CompleteClass */
    override val input: GetChannelsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetChannelsInput, GetChannelsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
  }
}
