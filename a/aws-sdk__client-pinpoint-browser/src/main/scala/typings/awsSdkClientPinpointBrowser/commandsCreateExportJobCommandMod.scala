package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
import typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateExportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateExportJobCommand", "CreateExportJobCommand")
  @js.native
  open class CreateExportJobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateExportJobInput, 
          OutputTypesUnion, 
          CreateExportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateExportJobInput) = this()
    
    /* CompleteClass */
    override val input: CreateExportJobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateExportJobInput, CreateExportJobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateExportJobInput, CreateExportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[CreateExportJobInput, CreateExportJobOutput] = js.native
  }
}
