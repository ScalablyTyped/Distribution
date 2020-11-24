package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCampaignResponse extends js.Object {
  
  /**
    * The same campaign ARN as given in the request.
    */
  var campaignArn: js.UndefOr[Arn] = js.native
}
object UpdateCampaignResponse {
  
  @scala.inline
  def apply(): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
  
  @scala.inline
  implicit class UpdateCampaignResponseOps[Self <: UpdateCampaignResponse] (val x: Self) extends AnyVal {
    
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
    def setCampaignArn(value: Arn): Self = this.set("campaignArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignArn: Self = this.set("campaignArn", js.undefined)
  }
}
