package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
import typings.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DeleteStreamCommand", "DeleteStreamCommand")
  @js.native
  class DeleteStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteStreamInput, 
          OutputTypesUnion, 
          DeleteStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DeleteStreamInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
  }
}
