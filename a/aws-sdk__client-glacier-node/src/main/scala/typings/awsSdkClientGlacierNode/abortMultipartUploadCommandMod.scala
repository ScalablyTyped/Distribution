package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typings.awsSdkClientGlacierNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/AbortMultipartUploadCommand", "AbortMultipartUploadCommand")
  @js.native
  class AbortMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          AbortMultipartUploadInput, 
          OutputTypesUnion, 
          AbortMultipartUploadOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: AbortMultipartUploadInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  }
}
