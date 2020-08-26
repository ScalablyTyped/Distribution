package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Node.typesPutObjectOutputMod.PutObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectCommand", JSImport.Namespace)
@js.native
object putObjectCommandMod extends js.Object {
  @js.native
  class PutObjectCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectInput[Readable], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectInput[Readable]) = this()
    val middlewareStack: MiddlewareStack[PutObjectInput[Readable], PutObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Readable], PutObjectOutput] = js.native
  }
  
}

