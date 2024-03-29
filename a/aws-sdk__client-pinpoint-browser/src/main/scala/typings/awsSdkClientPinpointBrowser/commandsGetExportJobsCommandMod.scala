package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput
import typings.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetExportJobsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobsCommand", "GetExportJobsCommand")
  @js.native
  open class GetExportJobsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetExportJobsInput, 
          OutputTypesUnion, 
          GetExportJobsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetExportJobsInput) = this()
    
    /* CompleteClass */
    override val input: GetExportJobsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetExportJobsInput, GetExportJobsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
  }
}
