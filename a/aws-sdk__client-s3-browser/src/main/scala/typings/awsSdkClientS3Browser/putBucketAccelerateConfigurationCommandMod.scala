package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAccelerateConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketAccelerateConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketAccelerateConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAccelerateConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAccelerateConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketAccelerateConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
  }
  
}

