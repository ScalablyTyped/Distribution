package typings.awsSdkMiddlewareEc2Copysnapshot.mod

import typings.awsSdkTypes.middlewareMod.Middleware
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-ec2-copysnapshot", "addPresignedUrl")
@js.native
object addPresignedUrl extends js.Object {
  def apply[Input /* <: CopySnapshotInput */, Output /* <: MetadataBearer */](hasRegionCredentialsEndpointBase64EncoderUtf8DecoderSha256: AddPresignedUrlParameters): Middleware[Input, Output] = js.native
}

