package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
import typings.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createExportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateExportJobCommand", "CreateExportJobCommand")
  @js.native
  class CreateExportJobCommand protected () extends Command[
          InputTypesUnion, 
          CreateExportJobInput, 
          OutputTypesUnion, 
          CreateExportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateExportJobInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateExportJobInput, CreateExportJobOutput] = js.native
  }
}
