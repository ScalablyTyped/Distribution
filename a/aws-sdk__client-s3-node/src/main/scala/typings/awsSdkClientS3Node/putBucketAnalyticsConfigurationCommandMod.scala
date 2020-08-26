package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
import typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketAnalyticsConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[
        PutBucketAnalyticsConfigurationInput, 
        PutBucketAnalyticsConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

