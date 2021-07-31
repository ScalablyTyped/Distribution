package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationInputMod.GetBucketNotificationConfigurationInput
import typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod.GetBucketNotificationConfigurationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBucketNotificationConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketNotificationConfigurationCommand", "GetBucketNotificationConfigurationCommand")
  @js.native
  class GetBucketNotificationConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          GetBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketNotificationConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketNotificationConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketNotificationConfigurationInput, GetBucketNotificationConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationConfigurationInput, GetBucketNotificationConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[GetBucketNotificationConfigurationInput, GetBucketNotificationConfigurationOutput] = js.native
  }
}
