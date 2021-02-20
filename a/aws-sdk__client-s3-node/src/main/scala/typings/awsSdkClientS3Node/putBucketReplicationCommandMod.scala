package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typings.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putBucketReplicationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketReplicationCommand", "PutBucketReplicationCommand")
  @js.native
  class PutBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketReplicationInput, 
          OutputTypesUnion, 
          PutBucketReplicationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketReplicationInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
  }
}
