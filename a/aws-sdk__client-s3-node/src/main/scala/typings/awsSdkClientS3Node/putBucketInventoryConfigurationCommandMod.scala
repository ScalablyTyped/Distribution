package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketInventoryConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketInventoryConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          PutBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketInventoryConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[
        PutBucketInventoryConfigurationInput, 
        PutBucketInventoryConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
  }
  
}

