package typings.atAwsDashSdkClientDashS3DashNode.commandsPutBucketInventoryConfigurationCommandMod

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
import typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketInventoryConfigurationCommand", "PutBucketInventoryConfigurationCommand")
@js.native
class PutBucketInventoryConfigurationCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketInventoryConfigurationInput, 
      OutputTypesUnion, 
      PutBucketInventoryConfigurationOutput, 
      S3ResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutBucketInventoryConfigurationInput) = this()
  /* CompleteClass */
  override val input: PutBucketInventoryConfigurationInput = js.native
  val middlewareStack: MiddlewareStack[
    PutBucketInventoryConfigurationInput, 
    PutBucketInventoryConfigurationOutput, 
    Readable
  ] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
}

