package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput
import typings.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getExportJobsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobsCommand", "GetExportJobsCommand")
  @js.native
  class GetExportJobsCommand protected ()
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
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: js.Any
    ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
  }
}
