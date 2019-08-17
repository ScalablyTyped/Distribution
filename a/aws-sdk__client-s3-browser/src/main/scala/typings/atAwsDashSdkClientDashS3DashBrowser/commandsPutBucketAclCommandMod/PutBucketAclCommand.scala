package typings.atAwsDashSdkClientDashS3DashBrowser.commandsPutBucketAclCommandMod

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketAclInputMod.PutBucketAclInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketAclOutputMod.PutBucketAclOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAclCommand", "PutBucketAclCommand")
@js.native
class PutBucketAclCommand protected () extends Command[
      InputTypesUnion, 
      PutBucketAclInput, 
      OutputTypesUnion, 
      PutBucketAclOutput, 
      S3ResolvedConfiguration, 
      Blob
    ] {
  def this(input: PutBucketAclInput) = this()
  /* CompleteClass */
  override val input: PutBucketAclInput = js.native
  val middlewareStack: MiddlewareStack[PutBucketAclInput, PutBucketAclOutput, Blob] = js.native
  val model: OperationModel = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAclInput, PutBucketAclOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: S3ResolvedConfiguration
  ): Handler[PutBucketAclInput, PutBucketAclOutput] = js.native
}

