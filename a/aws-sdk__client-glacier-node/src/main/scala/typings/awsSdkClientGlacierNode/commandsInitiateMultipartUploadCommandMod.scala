package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
import typings.awsSdkClientGlacierNode.typesInitiateMultipartUploadOutputMod.InitiateMultipartUploadOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsInitiateMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/InitiateMultipartUploadCommand", "InitiateMultipartUploadCommand")
  @js.native
  open class InitiateMultipartUploadCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          InitiateMultipartUploadInput, 
          OutputTypesUnion, 
          InitiateMultipartUploadOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: InitiateMultipartUploadInput) = this()
    
    /* CompleteClass */
    override val input: InitiateMultipartUploadInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
  }
}
