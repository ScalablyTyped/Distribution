package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput
import typings.awsSdkClientS3Browser.typesCopyObjectOutputMod.CopyObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/CopyObjectCommand", JSImport.Namespace)
@js.native
object copyObjectCommandMod extends js.Object {
  @js.native
  class CopyObjectCommand protected () extends Command[
          InputTypesUnion, 
          CopyObjectInput, 
          OutputTypesUnion, 
          CopyObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: CopyObjectInput) = this()
    val middlewareStack: MiddlewareStack[CopyObjectInput, CopyObjectOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[CopyObjectInput, CopyObjectOutput] = js.native
  }
  
}

