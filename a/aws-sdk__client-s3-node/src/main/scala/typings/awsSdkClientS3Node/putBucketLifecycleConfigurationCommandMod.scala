package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketLifecycleConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketLifecycleConfigurationCommand", "PutBucketLifecycleConfigurationCommand")
  @js.native
  class PutBucketLifecycleConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          PutBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketLifecycleConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketLifecycleConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketLifecycleConfigurationInput, PutBucketLifecycleConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleConfigurationInput, PutBucketLifecycleConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[PutBucketLifecycleConfigurationInput, PutBucketLifecycleConfigurationOutput] = js.native
  }
}
