package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendQuota extends StObject {
  
  /**
    * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
    */
  var Max24HourSend: js.UndefOr[typings.awsSdk.sesv2Mod.Max24HourSend] = js.native
  
  /**
    * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
    */
  var MaxSendRate: js.UndefOr[typings.awsSdk.sesv2Mod.MaxSendRate] = js.native
  
  /**
    * The number of emails sent from your Amazon SES account in the current AWS Region over the past 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typings.awsSdk.sesv2Mod.SentLast24Hours] = js.native
}
object SendQuota {
  
  @scala.inline
  def apply(): SendQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendQuota]
  }
  
  @scala.inline
  implicit class SendQuotaMutableBuilder[Self <: SendQuota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax24HourSend(value: Max24HourSend): Self = StObject.set(x, "Max24HourSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax24HourSendUndefined: Self = StObject.set(x, "Max24HourSend", js.undefined)
    
    @scala.inline
    def setMaxSendRate(value: MaxSendRate): Self = StObject.set(x, "MaxSendRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSendRateUndefined: Self = StObject.set(x, "MaxSendRate", js.undefined)
    
    @scala.inline
    def setSentLast24Hours(value: SentLast24Hours): Self = StObject.set(x, "SentLast24Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentLast24HoursUndefined: Self = StObject.set(x, "SentLast24Hours", js.undefined)
  }
}
