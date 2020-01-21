package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesRestoreObjectInputMod.RestoreObjectInput
import typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod.RestoreObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/RestoreObjectCommand", JSImport.Namespace)
@js.native
object restoreObjectCommandMod extends js.Object {
  @js.native
  class RestoreObjectCommand protected () extends Command[
          InputTypesUnion, 
          RestoreObjectInput, 
          OutputTypesUnion, 
          RestoreObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: RestoreObjectInput) = this()
    /* CompleteClass */
    override val input: RestoreObjectInput = js.native
    val middlewareStack: MiddlewareStack[RestoreObjectInput, RestoreObjectOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
  }
  
}

