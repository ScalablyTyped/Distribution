package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetExportJobInputMod.GetExportJobInput
import typings.awsSdkClientPinpointBrowser.typesGetExportJobOutputMod.GetExportJobOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetExportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobCommand", "GetExportJobCommand")
  @js.native
  open class GetExportJobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetExportJobInput, 
          OutputTypesUnion, 
          GetExportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetExportJobInput) = this()
    
    /* CompleteClass */
    override val input: GetExportJobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetExportJobInput, GetExportJobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetExportJobInput, GetExportJobOutput] = js.native
  }
}
