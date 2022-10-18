package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
import typings.awsSdkClientS3Node.typesGetBucketLocationOutputMod.GetBucketLocationOutput
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketLocationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/GetBucketLocationCommand", "GetBucketLocationCommand")
  @js.native
  open class GetBucketLocationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketLocationInput, 
          OutputTypesUnion, 
          GetBucketLocationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketLocationInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketLocationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketLocationInput, GetBucketLocationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketLocationInput, GetBucketLocationOutput] = js.native
  }
}
