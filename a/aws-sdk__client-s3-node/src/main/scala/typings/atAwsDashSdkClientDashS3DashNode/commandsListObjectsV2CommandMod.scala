package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListObjectsV2InputMod.ListObjectsV2Input
import typings.atAwsDashSdkClientDashS3DashNode.typesListObjectsV2OutputMod.ListObjectsV2Output
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListObjectsV2Command", JSImport.Namespace)
@js.native
object commandsListObjectsV2CommandMod extends js.Object {
  @js.native
  class ListObjectsV2Command protected () extends Command[
          InputTypesUnion, 
          ListObjectsV2Input, 
          OutputTypesUnion, 
          ListObjectsV2Output, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListObjectsV2Input) = this()
    /* CompleteClass */
    override val input: ListObjectsV2Input = js.native
    val middlewareStack: MiddlewareStack[ListObjectsV2Input, ListObjectsV2Output, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsV2Input, ListObjectsV2Output] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsV2Input, ListObjectsV2Output] = js.native
  }
  
}

