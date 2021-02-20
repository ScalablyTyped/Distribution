package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCampaignRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn = js.native
  
  /**
    * The configuration details of a campaign.
    */
  var campaignConfig: js.UndefOr[CampaignConfig] = js.native
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  
  /**
    * The ARN of a new solution version to deploy.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}
object UpdateCampaignRequest {
  
  @scala.inline
  def apply(campaignArn: Arn): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
  
  @scala.inline
  implicit class UpdateCampaignRequestMutableBuilder[Self <: UpdateCampaignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignConfig(value: CampaignConfig): Self = StObject.set(x, "campaignConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignConfigUndefined: Self = StObject.set(x, "campaignConfig", js.undefined)
    
    @scala.inline
    def setMinProvisionedTPS(value: TransactionsPerSecond): Self = StObject.set(x, "minProvisionedTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProvisionedTPSUndefined: Self = StObject.set(x, "minProvisionedTPS", js.undefined)
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
