package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
import typings.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAppCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppCommand", "GetAppCommand")
  @js.native
  class GetAppCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetAppInput, 
          OutputTypesUnion, 
          GetAppOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetAppInput) = this()
    
    /* CompleteClass */
    override val input: GetAppInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetAppInput, GetAppOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetAppInput, GetAppOutput] = js.native
  }
}
