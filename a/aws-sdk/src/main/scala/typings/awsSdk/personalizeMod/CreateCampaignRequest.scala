package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCampaignRequest extends js.Object {
  
  /**
    * The configuration details of a campaign.
    */
  var campaignConfig: js.UndefOr[CampaignConfig] = js.native
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: TransactionsPerSecond = js.native
  
  /**
    * A name for the new campaign. The campaign name must be unique within your account.
    */
  var name: Name = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the solution version to deploy.
    */
  var solutionVersionArn: Arn = js.native
}
object CreateCampaignRequest {
  
  @scala.inline
  def apply(minProvisionedTPS: TransactionsPerSecond, name: Name, solutionVersionArn: Arn): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(minProvisionedTPS = minProvisionedTPS.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignRequest]
  }
  
  @scala.inline
  implicit class CreateCampaignRequestOps[Self <: CreateCampaignRequest] (val x: Self) extends AnyVal {
    
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
    def setMinProvisionedTPS(value: TransactionsPerSecond): Self = this.set("minProvisionedTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignConfig(value: CampaignConfig): Self = this.set("campaignConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignConfig: Self = this.set("campaignConfig", js.undefined)
  }
}
