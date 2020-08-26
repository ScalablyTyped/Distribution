package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesCopyObjectInputMod.CopyObjectInput
import typings.awsSdkClientS3Node.typesCopyObjectOutputMod.CopyObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/CopyObjectCommand", JSImport.Namespace)
@js.native
object copyObjectCommandMod extends js.Object {
  @js.native
  class CopyObjectCommand protected () extends Command[
          InputTypesUnion, 
          CopyObjectInput, 
          OutputTypesUnion, 
          CopyObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: CopyObjectInput) = this()
    val middlewareStack: MiddlewareStack[CopyObjectInput, CopyObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CopyObjectInput, CopyObjectOutput] = js.native
  }
  
}

