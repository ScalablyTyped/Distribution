package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
import typings.awsSdkClientS3Node.typesGetObjectAclOutputMod.GetObjectAclOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectAclCommand", JSImport.Namespace)
@js.native
object getObjectAclCommandMod extends js.Object {
  @js.native
  class GetObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectAclInput, 
          OutputTypesUnion, 
          GetObjectAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetObjectAclInput) = this()
    /* CompleteClass */
    override val input: GetObjectAclInput = js.native
    val middlewareStack: MiddlewareStack[GetObjectAclInput, GetObjectAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
  }
  
}

