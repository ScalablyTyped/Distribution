package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typings.awsSdkClientGlacierNode.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completeMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/CompleteMultipartUploadCommand", "CompleteMultipartUploadCommand")
  @js.native
  class CompleteMultipartUploadCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CompleteMultipartUploadInput, 
          OutputTypesUnion, 
          CompleteMultipartUploadOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: CompleteMultipartUploadInput) = this()
    
    /* CompleteClass */
    override val input: CompleteMultipartUploadInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
  }
}
