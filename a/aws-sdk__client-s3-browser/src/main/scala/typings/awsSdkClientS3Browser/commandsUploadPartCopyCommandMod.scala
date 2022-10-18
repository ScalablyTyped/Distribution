package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput
import typings.awsSdkClientS3Browser.typesUploadPartCopyOutputMod.UploadPartCopyOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUploadPartCopyCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCopyCommand", "UploadPartCopyCommand")
  @js.native
  open class UploadPartCopyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UploadPartCopyInput, 
          OutputTypesUnion, 
          UploadPartCopyOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: UploadPartCopyInput) = this()
    
    /* CompleteClass */
    override val input: UploadPartCopyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UploadPartCopyInput, UploadPartCopyOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[UploadPartCopyInput, UploadPartCopyOutput] = js.native
  }
}
