package typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCampaignsResponse extends CampaignsResponse {
  /**
    * A list of campaigns.
    */
  @JSName("Item")
  var Item_UnmarshalledCampaignsResponse: js.UndefOr[js.Array[UnmarshalledCampaignResponse]] = js.native
}

object UnmarshalledCampaignsResponse {
  @scala.inline
  def apply(): UnmarshalledCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCampaignsResponse]
  }
  @scala.inline
  implicit class UnmarshalledCampaignsResponseOps[Self <: UnmarshalledCampaignsResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: UnmarshalledCampaignResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[UnmarshalledCampaignResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

