package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningPlatformRequest extends js.Object {
  /**
    * The ID of the target signing platform.
    */
  var platformId: PlatformId = js.native
}

object GetSigningPlatformRequest {
  @scala.inline
  def apply(platformId: PlatformId): GetSigningPlatformRequest = {
    val __obj = js.Dynamic.literal(platformId = platformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningPlatformRequest]
  }
}

