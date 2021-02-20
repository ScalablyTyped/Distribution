package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
import typings.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startStreamEncryptionCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/StartStreamEncryptionCommand", "StartStreamEncryptionCommand")
  @js.native
  class StartStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StartStreamEncryptionInput, 
          OutputTypesUnion, 
          StartStreamEncryptionOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: StartStreamEncryptionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
  }
}
