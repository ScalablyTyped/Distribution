package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketTaggingInputMod.PutBucketTaggingInput
import typings.awsSdkClientS3Browser.typesPutBucketTaggingOutputMod.PutBucketTaggingOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketTaggingCommand", JSImport.Namespace)
@js.native
object putBucketTaggingCommandMod extends js.Object {
  
  @js.native
  class PutBucketTaggingCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketTaggingInput, 
          OutputTypesUnion, 
          PutBucketTaggingOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketTaggingInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketTaggingInput, PutBucketTaggingOutput] = js.native
  }
}
