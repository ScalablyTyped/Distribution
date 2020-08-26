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
  @scala.inline
  implicit class GetSigningPlatformRequestOps[Self <: GetSigningPlatformRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlatformId(value: PlatformId): Self = this.set("platformId", value.asInstanceOf[js.Any])
  }
  
}

