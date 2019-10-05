package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectAclInputMod.GetObjectAclInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectAclOutputMod.GetObjectAclOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetObjectAclCommand", JSImport.Namespace)
@js.native
object commandsGetObjectAclCommandMod extends js.Object {
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
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectAclInput, GetObjectAclOutput] = js.native
  }
  
}

