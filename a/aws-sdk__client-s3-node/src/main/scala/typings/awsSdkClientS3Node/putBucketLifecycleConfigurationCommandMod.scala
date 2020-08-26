package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLifecycleConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketLifecycleConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketLifecycleConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          PutBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketLifecycleConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[
        PutBucketLifecycleConfigurationInput, 
        PutBucketLifecycleConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleConfigurationInput, PutBucketLifecycleConfigurationOutput] = js.native
  }
  
}

