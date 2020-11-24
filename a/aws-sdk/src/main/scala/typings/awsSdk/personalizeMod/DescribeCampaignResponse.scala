package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCampaignResponse extends js.Object {
  
  /**
    * The properties of the campaign.
    */
  var campaign: js.UndefOr[Campaign] = js.native
}
object DescribeCampaignResponse {
  
  @scala.inline
  def apply(): DescribeCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCampaignResponse]
  }
  
  @scala.inline
  implicit class DescribeCampaignResponseOps[Self <: DescribeCampaignResponse] (val x: Self) extends AnyVal {
    
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
    def setCampaign(value: Campaign): Self = this.set("campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign: Self = this.set("campaign", js.undefined)
  }
}
