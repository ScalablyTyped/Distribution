package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatistics extends StObject {
  
  /**
    * The total number of emails that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.undefined
  
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
    */
  var ProjectedInbox: js.UndefOr[Volume] = js.undefined
  
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk mail folders.
    */
  var ProjectedSpam: js.UndefOr[Volume] = js.undefined
  
  /**
    * The total number of emails that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.undefined
}
object VolumeStatistics {
  
  inline def apply(): VolumeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatistics]
  }
  
  extension [Self <: VolumeStatistics](x: Self) {
    
    inline def setInboxRawCount(value: Volume): Self = StObject.set(x, "InboxRawCount", value.asInstanceOf[js.Any])
    
    inline def setInboxRawCountUndefined: Self = StObject.set(x, "InboxRawCount", js.undefined)
    
    inline def setProjectedInbox(value: Volume): Self = StObject.set(x, "ProjectedInbox", value.asInstanceOf[js.Any])
    
    inline def setProjectedInboxUndefined: Self = StObject.set(x, "ProjectedInbox", js.undefined)
    
    inline def setProjectedSpam(value: Volume): Self = StObject.set(x, "ProjectedSpam", value.asInstanceOf[js.Any])
    
    inline def setProjectedSpamUndefined: Self = StObject.set(x, "ProjectedSpam", js.undefined)
    
    inline def setSpamRawCount(value: Volume): Self = StObject.set(x, "SpamRawCount", value.asInstanceOf[js.Any])
    
    inline def setSpamRawCountUndefined: Self = StObject.set(x, "SpamRawCount", js.undefined)
  }
}
