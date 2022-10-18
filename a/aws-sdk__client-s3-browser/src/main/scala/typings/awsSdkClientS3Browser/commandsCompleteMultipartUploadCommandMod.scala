package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typings.awsSdkClientS3Browser.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCompleteMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/CompleteMultipartUploadCommand", "CompleteMultipartUploadCommand")
  @js.native
  open class CompleteMultipartUploadCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CompleteMultipartUploadInput, 
          OutputTypesUnion, 
          CompleteMultipartUploadOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: CompleteMultipartUploadInput) = this()
    
    /* CompleteClass */
    override val input: CompleteMultipartUploadInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
  }
}
