package typings.atAwsDashSdkMiddlewareDashEc2DashCopysnapshot.atAwsDashSdkMiddlewareDashEc2DashCopysnapshotMod

import typings.atAwsDashSdkTypes.buildMiddlewareMod.Middleware
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-ec2-copysnapshot", "addPresignedUrl")
@js.native
object addPresignedUrl extends js.Object {
  def apply[Input /* <: CopySnapshotInput */, Output /* <: MetadataBearer */](hasRegionCredentialsEndpointBase64EncoderUtf8DecoderSha256: AddPresignedUrlParameters): Middleware[Input, Output] = js.native
}

