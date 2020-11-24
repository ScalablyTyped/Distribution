package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketAclInputMod.PutBucketAclInput
import typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod.PutBucketAclOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAclCommand", JSImport.Namespace)
@js.native
object putBucketAclCommandMod extends js.Object {
  
  @js.native
  class PutBucketAclCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAclInput, 
          OutputTypesUnion, 
          PutBucketAclOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketAclInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAclInput, PutBucketAclOutput] = js.native
  }
}
