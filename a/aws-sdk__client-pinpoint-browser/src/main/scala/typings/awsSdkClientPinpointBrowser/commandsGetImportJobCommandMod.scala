package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
import typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetImportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobCommand", "GetImportJobCommand")
  @js.native
  open class GetImportJobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetImportJobInput, 
          OutputTypesUnion, 
          GetImportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetImportJobInput) = this()
    
    /* CompleteClass */
    override val input: GetImportJobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetImportJobInput, GetImportJobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
  }
}
