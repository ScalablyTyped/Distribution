package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationInputMod.GetBucketAccelerateConfigurationInput
import typings.awsSdkClientS3Browser.typesGetBucketAccelerateConfigurationOutputMod.GetBucketAccelerateConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketAccelerateConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketAccelerateConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketAccelerateConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAccelerateConfigurationInput, 
          OutputTypesUnion, 
          GetBucketAccelerateConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketAccelerateConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetBucketAccelerateConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAccelerateConfigurationInput, GetBucketAccelerateConfigurationOutput] = js.native
  }
  
}

