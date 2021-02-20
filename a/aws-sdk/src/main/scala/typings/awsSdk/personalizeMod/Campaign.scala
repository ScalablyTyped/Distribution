package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Campaign extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign. 
    */
  var campaignArn: js.UndefOr[Arn] = js.native
  
  /**
    * The configuration details of a campaign.
    */
  var campaignConfig: js.UndefOr[CampaignConfig] = js.native
  
  /**
    * The date and time (in Unix format) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The date and time (in Unix format) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  var latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary] = js.native
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a specific version of the solution.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}
object Campaign {
  
  @scala.inline
  def apply(): Campaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaign]
  }
  
  @scala.inline
  implicit class CampaignMutableBuilder[Self <: Campaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
    
    @scala.inline
    def setCampaignConfig(value: CampaignConfig): Self = StObject.set(x, "campaignConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignConfigUndefined: Self = StObject.set(x, "campaignConfig", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setLatestCampaignUpdate(value: CampaignUpdateSummary): Self = StObject.set(x, "latestCampaignUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestCampaignUpdateUndefined: Self = StObject.set(x, "latestCampaignUpdate", js.undefined)
    
    @scala.inline
    def setMinProvisionedTPS(value: TransactionsPerSecond): Self = StObject.set(x, "minProvisionedTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProvisionedTPSUndefined: Self = StObject.set(x, "minProvisionedTPS", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
