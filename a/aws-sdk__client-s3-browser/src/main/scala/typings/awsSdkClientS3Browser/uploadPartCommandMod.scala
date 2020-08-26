package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typings.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCommand", JSImport.Namespace)
@js.native
object uploadPartCommandMod extends js.Object {
  @js.native
  class UploadPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadPartInput[Blob], 
          OutputTypesUnion, 
          UploadPartOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: UploadPartInput[Blob]) = this()
    val middlewareStack: MiddlewareStack[UploadPartInput[Blob], UploadPartOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Blob], UploadPartOutput] = js.native
  }
  
}

