package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignUpdateSummary extends StObject {
  
  var campaignConfig: js.UndefOr[CampaignConfig] = js.native
  
  /**
    * The date and time (in Unix time) that the campaign update was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * If a campaign update fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The date and time (in Unix time) that the campaign update was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the deployed solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the campaign update. A campaign update can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}
object CampaignUpdateSummary {
  
  @scala.inline
  def apply(): CampaignUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignUpdateSummary]
  }
  
  @scala.inline
  implicit class CampaignUpdateSummaryMutableBuilder[Self <: CampaignUpdateSummary] (val x: Self) extends AnyVal {
    
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
    def setMinProvisionedTPS(value: TransactionsPerSecond): Self = StObject.set(x, "minProvisionedTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProvisionedTPSUndefined: Self = StObject.set(x, "minProvisionedTPS", js.undefined)
    
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
