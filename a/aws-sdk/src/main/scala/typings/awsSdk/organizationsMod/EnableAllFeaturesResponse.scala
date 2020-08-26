package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableAllFeaturesResponse extends js.Object {
  /**
    * A structure that contains details about the handshake created to support this request to enable all features in the organization.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.native
}

object EnableAllFeaturesResponse {
  @scala.inline
  def apply(): EnableAllFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAllFeaturesResponse]
  }
  @scala.inline
  implicit class EnableAllFeaturesResponseOps[Self <: EnableAllFeaturesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandshake(value: Handshake): Self = this.set("Handshake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandshake: Self = this.set("Handshake", js.undefined)
  }
  
}

