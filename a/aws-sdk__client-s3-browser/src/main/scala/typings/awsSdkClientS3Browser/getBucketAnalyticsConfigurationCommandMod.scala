package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
import typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          GetBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketAnalyticsConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetBucketAnalyticsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

