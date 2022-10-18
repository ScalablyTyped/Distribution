package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
import typings.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateAppCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateAppCommand", "CreateAppCommand")
  @js.native
  open class CreateAppCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateAppInput, 
          OutputTypesUnion, 
          CreateAppOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateAppInput) = this()
    
    /* CompleteClass */
    override val input: CreateAppInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateAppInput, CreateAppOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
  }
}
