package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendDataPoint extends js.Object {
  
  /**
    * Number of emails that have bounced.
    */
  var Bounces: js.UndefOr[Counter] = js.native
  
  /**
    * Number of unwanted emails that were rejected by recipients.
    */
  var Complaints: js.UndefOr[Counter] = js.native
  
  /**
    * Number of emails that have been sent.
    */
  var DeliveryAttempts: js.UndefOr[Counter] = js.native
  
  /**
    * Number of emails rejected by Amazon SES.
    */
  var Rejects: js.UndefOr[Counter] = js.native
  
  /**
    * Time of the data point.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.sesMod.Timestamp] = js.native
}
object SendDataPoint {
  
  @scala.inline
  def apply(): SendDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDataPoint]
  }
  
  @scala.inline
  implicit class SendDataPointOps[Self <: SendDataPoint] (val x: Self) extends AnyVal {
    
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
    def setBounces(value: Counter): Self = this.set("Bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounces: Self = this.set("Bounces", js.undefined)
    
    @scala.inline
    def setComplaints(value: Counter): Self = this.set("Complaints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplaints: Self = this.set("Complaints", js.undefined)
    
    @scala.inline
    def setDeliveryAttempts(value: Counter): Self = this.set("DeliveryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryAttempts: Self = this.set("DeliveryAttempts", js.undefined)
    
    @scala.inline
    def setRejects(value: Counter): Self = this.set("Rejects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejects: Self = this.set("Rejects", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
