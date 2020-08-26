package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
import typings.awsSdkClientS3Node.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAccelerateConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketAccelerateConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketAccelerateConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAccelerateConfigurationInput, 
          OutputTypesUnion, 
          GetBucketAccelerateConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketAccelerateConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[
        GetBucketAccelerateConfigurationInput, 
        GetBucketAccelerateConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput] = js.native
  }
  
}

