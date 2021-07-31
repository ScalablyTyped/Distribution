package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketVersioningCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutBucketVersioningCommand", "PutBucketVersioningCommand")
  @js.native
  class PutBucketVersioningCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketVersioningInput, 
          OutputTypesUnion, 
          PutBucketVersioningOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketVersioningInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketVersioningInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
  }
}
