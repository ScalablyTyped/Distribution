package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
import typings.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketInventoryConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketInventoryConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketInventoryConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[
        DeleteBucketInventoryConfigurationInput, 
        DeleteBucketInventoryConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
  }
  
}

