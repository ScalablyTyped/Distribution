package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput
import typings.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/RestoreObjectCommand", JSImport.Namespace)
@js.native
object restoreObjectCommandMod extends js.Object {
  @js.native
  class RestoreObjectCommand protected () extends Command[
          InputTypesUnion, 
          RestoreObjectInput, 
          OutputTypesUnion, 
          RestoreObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: RestoreObjectInput) = this()
    val middlewareStack: MiddlewareStack[RestoreObjectInput, RestoreObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
  }
  
}

