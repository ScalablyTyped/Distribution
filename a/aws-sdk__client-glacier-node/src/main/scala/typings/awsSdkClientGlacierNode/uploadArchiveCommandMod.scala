package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typings.awsSdkClientGlacierNode.typesUploadArchiveOutputMod.UploadArchiveOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadArchiveCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/UploadArchiveCommand", "UploadArchiveCommand")
  @js.native
  class UploadArchiveCommand protected () extends Command[
          InputTypesUnion, 
          UploadArchiveInput[Readable], 
          OutputTypesUnion, 
          UploadArchiveOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: UploadArchiveInput[Readable]) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
  }
}
