package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.typesPutBucketNotificationInputMod.PutBucketNotificationInput
import typings.awsSdkClientS3Browser.typesPutBucketNotificationOutputMod.PutBucketNotificationOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketNotificationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutBucketNotificationCommand", "PutBucketNotificationCommand")
  @js.native
  open class PutBucketNotificationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketNotificationInput, 
          OutputTypesUnion, 
          PutBucketNotificationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketNotificationInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketNotificationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketNotificationInput, PutBucketNotificationOutput] = js.native
  }
}
