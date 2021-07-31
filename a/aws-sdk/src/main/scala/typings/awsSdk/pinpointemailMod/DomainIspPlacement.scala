package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainIspPlacement extends StObject {
  
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.undefined
  
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typings.awsSdk.pinpointemailMod.IspName] = js.undefined
  
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.undefined
}
object DomainIspPlacement {
  
  @scala.inline
  def apply(): DomainIspPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainIspPlacement]
  }
  
  @scala.inline
  implicit class DomainIspPlacementMutableBuilder[Self <: DomainIspPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInboxPercentage(value: Percentage): Self = StObject.set(x, "InboxPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboxPercentageUndefined: Self = StObject.set(x, "InboxPercentage", js.undefined)
    
    @scala.inline
    def setInboxRawCount(value: Volume): Self = StObject.set(x, "InboxRawCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboxRawCountUndefined: Self = StObject.set(x, "InboxRawCount", js.undefined)
    
    @scala.inline
    def setIspName(value: IspName): Self = StObject.set(x, "IspName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIspNameUndefined: Self = StObject.set(x, "IspName", js.undefined)
    
    @scala.inline
    def setSpamPercentage(value: Percentage): Self = StObject.set(x, "SpamPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamPercentageUndefined: Self = StObject.set(x, "SpamPercentage", js.undefined)
    
    @scala.inline
    def setSpamRawCount(value: Volume): Self = StObject.set(x, "SpamRawCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamRawCountUndefined: Self = StObject.set(x, "SpamRawCount", js.undefined)
  }
}
