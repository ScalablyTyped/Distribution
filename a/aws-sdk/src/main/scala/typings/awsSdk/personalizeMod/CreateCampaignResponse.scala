package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCampaignResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.native
}
object CreateCampaignResponse {
  
  @scala.inline
  def apply(): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCampaignResponse]
  }
  
  @scala.inline
  implicit class CreateCampaignResponseOps[Self <: CreateCampaignResponse] (val x: Self) extends AnyVal {
    
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
