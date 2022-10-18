package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketAccelerateConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketAccelerateConfigurationCommand", "PutBucketAccelerateConfigurationCommand")
  @js.native
  open class PutBucketAccelerateConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketAccelerateConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAccelerateConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketAccelerateConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketAccelerateConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
  }
}
