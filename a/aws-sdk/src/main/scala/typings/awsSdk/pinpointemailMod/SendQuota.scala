package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendQuota extends js.Object {
  
  /**
    * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
    */
  var Max24HourSend: js.UndefOr[typings.awsSdk.pinpointemailMod.Max24HourSend] = js.native
  
  /**
    * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
    */
  var MaxSendRate: js.UndefOr[typings.awsSdk.pinpointemailMod.MaxSendRate] = js.native
  
  /**
    * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typings.awsSdk.pinpointemailMod.SentLast24Hours] = js.native
}
object SendQuota {
  
  @scala.inline
  def apply(): SendQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendQuota]
  }
  
  @scala.inline
  implicit class SendQuotaOps[Self <: SendQuota] (val x: Self) extends AnyVal {
    
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
    def setMax24HourSend(value: Max24HourSend): Self = this.set("Max24HourSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax24HourSend: Self = this.set("Max24HourSend", js.undefined)
    
    @scala.inline
    def setMaxSendRate(value: MaxSendRate): Self = this.set("MaxSendRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSendRate: Self = this.set("MaxSendRate", js.undefined)
    
    @scala.inline
    def setSentLast24Hours(value: SentLast24Hours): Self = this.set("SentLast24Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentLast24Hours: Self = this.set("SentLast24Hours", js.undefined)
  }
}
