package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketAnalyticsConfigurationsCommand", JSImport.Namespace)
@js.native
object commandsListBucketAnalyticsConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketAnalyticsConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketAnalyticsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketAnalyticsConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketAnalyticsConfigurationsInput) = this()
    /* CompleteClass */
    override val input: ListBucketAnalyticsConfigurationsInput = js.native
    val middlewareStack: MiddlewareStack[
        ListBucketAnalyticsConfigurationsInput, 
        ListBucketAnalyticsConfigurationsOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
  }
  
}

