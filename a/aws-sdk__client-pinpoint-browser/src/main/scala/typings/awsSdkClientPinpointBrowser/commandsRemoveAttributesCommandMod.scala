package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
import typings.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRemoveAttributesCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/RemoveAttributesCommand", "RemoveAttributesCommand")
  @js.native
  open class RemoveAttributesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          RemoveAttributesInput, 
          OutputTypesUnion, 
          RemoveAttributesOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: RemoveAttributesInput) = this()
    
    /* CompleteClass */
    override val input: RemoveAttributesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[RemoveAttributesInput, RemoveAttributesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[RemoveAttributesInput, RemoveAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[RemoveAttributesInput, RemoveAttributesOutput] = js.native
  }
}
