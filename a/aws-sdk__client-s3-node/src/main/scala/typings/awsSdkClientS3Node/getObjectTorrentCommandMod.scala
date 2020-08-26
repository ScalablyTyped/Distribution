package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetObjectTorrentInputMod.GetObjectTorrentInput
import typings.awsSdkClientS3Node.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectTorrentCommand", JSImport.Namespace)
@js.native
object getObjectTorrentCommandMod extends js.Object {
  @js.native
  class GetObjectTorrentCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectTorrentInput, 
          OutputTypesUnion, 
          GetObjectTorrentOutput[Readable], 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetObjectTorrentInput) = this()
    val middlewareStack: MiddlewareStack[GetObjectTorrentInput, GetObjectTorrentOutput[Readable], Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Readable]] = js.native
  }
  
}

