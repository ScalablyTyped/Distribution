package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
import typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          GetBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketAnalyticsConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetBucketAnalyticsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        GetBucketAnalyticsConfigurationInput, 
        GetBucketAnalyticsConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

