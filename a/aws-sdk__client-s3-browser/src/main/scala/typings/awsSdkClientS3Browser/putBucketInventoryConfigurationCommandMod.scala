package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
import typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketInventoryConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketInventoryConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          PutBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketInventoryConfigurationInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
  }
  
}

