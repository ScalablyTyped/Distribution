package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
import typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketNotificationConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutBucketNotificationConfigurationCommand", "PutBucketNotificationConfigurationCommand")
  @js.native
  open class PutBucketNotificationConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          PutBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketNotificationConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketNotificationConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
  }
}
