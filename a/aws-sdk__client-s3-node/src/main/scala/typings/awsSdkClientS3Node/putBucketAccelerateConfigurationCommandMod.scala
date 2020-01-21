package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketAccelerateConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketAccelerateConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketAccelerateConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAccelerateConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAccelerateConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketAccelerateConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketAccelerateConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        PutBucketAccelerateConfigurationInput, 
        PutBucketAccelerateConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
  }
  
}

