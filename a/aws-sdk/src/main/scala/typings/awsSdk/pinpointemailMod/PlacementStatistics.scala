package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementStatistics extends StObject {
  
  /**
    * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive inbox placement test.
    */
  var DkimPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement test.
    */
  var MissingPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox placement test.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive inbox placement test.
    */
  var SpfPercentage: js.UndefOr[Percentage] = js.undefined
}
object PlacementStatistics {
  
  @scala.inline
  def apply(): PlacementStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementStatistics]
  }
  
  @scala.inline
  implicit class PlacementStatisticsMutableBuilder[Self <: PlacementStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimPercentage(value: Percentage): Self = StObject.set(x, "DkimPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimPercentageUndefined: Self = StObject.set(x, "DkimPercentage", js.undefined)
    
    @scala.inline
    def setInboxPercentage(value: Percentage): Self = StObject.set(x, "InboxPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboxPercentageUndefined: Self = StObject.set(x, "InboxPercentage", js.undefined)
    
    @scala.inline
    def setMissingPercentage(value: Percentage): Self = StObject.set(x, "MissingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingPercentageUndefined: Self = StObject.set(x, "MissingPercentage", js.undefined)
    
    @scala.inline
    def setSpamPercentage(value: Percentage): Self = StObject.set(x, "SpamPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamPercentageUndefined: Self = StObject.set(x, "SpamPercentage", js.undefined)
    
    @scala.inline
    def setSpfPercentage(value: Percentage): Self = StObject.set(x, "SpfPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpfPercentageUndefined: Self = StObject.set(x, "SpfPercentage", js.undefined)
  }
}
