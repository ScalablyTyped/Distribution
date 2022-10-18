package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput
import typings.awsSdkClientS3Browser.typesHeadBucketOutputMod.HeadBucketOutput
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsHeadBucketCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/HeadBucketCommand", "HeadBucketCommand")
  @js.native
  open class HeadBucketCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          HeadBucketInput, 
          OutputTypesUnion, 
          HeadBucketOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: HeadBucketInput) = this()
    
    /* CompleteClass */
    override val input: HeadBucketInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[HeadBucketInput, HeadBucketOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[HeadBucketInput, HeadBucketOutput] = js.native
  }
}
