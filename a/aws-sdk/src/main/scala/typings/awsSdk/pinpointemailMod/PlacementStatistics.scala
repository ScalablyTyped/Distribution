package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementStatistics extends js.Object {
  
  /**
    * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive inbox placement test.
    */
  var DkimPercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement test.
    */
  var MissingPercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox placement test.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.native
  
  /**
    * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive inbox placement test.
    */
  var SpfPercentage: js.UndefOr[Percentage] = js.native
}
object PlacementStatistics {
  
  @scala.inline
  def apply(): PlacementStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementStatistics]
  }
  
  @scala.inline
  implicit class PlacementStatisticsOps[Self <: PlacementStatistics] (val x: Self) extends AnyVal {
    
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
    def setDkimPercentage(value: Percentage): Self = this.set("DkimPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimPercentage: Self = this.set("DkimPercentage", js.undefined)
    
    @scala.inline
    def setInboxPercentage(value: Percentage): Self = this.set("InboxPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboxPercentage: Self = this.set("InboxPercentage", js.undefined)
    
    @scala.inline
    def setMissingPercentage(value: Percentage): Self = this.set("MissingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingPercentage: Self = this.set("MissingPercentage", js.undefined)
    
    @scala.inline
    def setSpamPercentage(value: Percentage): Self = this.set("SpamPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpamPercentage: Self = this.set("SpamPercentage", js.undefined)
    
    @scala.inline
    def setSpfPercentage(value: Percentage): Self = this.set("SpfPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpfPercentage: Self = this.set("SpfPercentage", js.undefined)
  }
}
