package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput
import typings.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetImportJobsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobsCommand", "GetImportJobsCommand")
  @js.native
  open class GetImportJobsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetImportJobsInput, 
          OutputTypesUnion, 
          GetImportJobsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetImportJobsInput) = this()
    
    /* CompleteClass */
    override val input: GetImportJobsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetImportJobsInput, GetImportJobsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
  }
}
