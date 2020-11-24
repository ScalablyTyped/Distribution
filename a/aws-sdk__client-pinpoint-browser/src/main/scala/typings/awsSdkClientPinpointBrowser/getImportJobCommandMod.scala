package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetImportJobInputMod.GetImportJobInput
import typings.awsSdkClientPinpointBrowser.typesGetImportJobOutputMod.GetImportJobOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobCommand", JSImport.Namespace)
@js.native
object getImportJobCommandMod extends js.Object {
  
  @js.native
  class GetImportJobCommand protected () extends Command[
          InputTypesUnion, 
          GetImportJobInput, 
          OutputTypesUnion, 
          GetImportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetImportJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
  }
}
