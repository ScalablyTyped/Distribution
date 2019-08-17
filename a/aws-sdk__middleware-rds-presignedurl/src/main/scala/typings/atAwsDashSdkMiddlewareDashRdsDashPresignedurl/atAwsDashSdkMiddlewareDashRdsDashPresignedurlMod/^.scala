package typings.atAwsDashSdkMiddlewareDashRdsDashPresignedurl.atAwsDashSdkMiddlewareDashRdsDashPresignedurlMod

import typings.atAwsDashSdkTypes.buildMiddlewareMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-rds-presignedurl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildCrossRegionPresignedUrl[Input /* <: RDSInput */, Output /* <: js.Object */](
    hasSourceIdentifierKeyRegionCredentialsEndpointBase64EncoderUtf8DecoderSha256: BuildRDSPresignedUrlParameters
  ): Middleware[Input, Output] = js.native
}

