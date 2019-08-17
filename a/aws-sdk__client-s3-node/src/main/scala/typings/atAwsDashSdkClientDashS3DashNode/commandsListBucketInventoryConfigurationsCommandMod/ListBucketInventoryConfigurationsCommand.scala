package typings.atAwsDashSdkClientDashS3DashNode.commandsListBucketInventoryConfigurationsCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
import typings.atAwsDashSdkClientDashS3DashNode.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketInventoryConfigurationsCommand", "ListBucketInventoryConfigurationsCommand")
@js.native
class ListBucketInventoryConfigurationsCommand protected () extends Command[
      InputTypesUnion, 
      ListBucketInventoryConfigurationsInput, 
      OutputTypesUnion, 
      ListBucketInventoryConfigurationsOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: ListBucketInventoryConfigurationsInput) = this()
  /* CompleteClass */
  override val input: ListBucketInventoryConfigurationsInput = js.native
  val middlewareStack: MiddlewareStack[
    ListBucketInventoryConfigurationsInput, 
    ListBucketInventoryConfigurationsOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketInventoryConfigurationsInput, ListBucketInventoryConfigurationsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[ListBucketInventoryConfigurationsInput, ListBucketInventoryConfigurationsOutput] = js.native
}

