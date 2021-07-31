package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDataPoint extends StObject {
  
  /**
    * Number of emails that have bounced.
    */
  var Bounces: js.UndefOr[Counter] = js.undefined
  
  /**
    * Number of unwanted emails that were rejected by recipients.
    */
  var Complaints: js.UndefOr[Counter] = js.undefined
  
  /**
    * Number of emails that have been sent.
    */
  var DeliveryAttempts: js.UndefOr[Counter] = js.undefined
  
  /**
    * Number of emails rejected by Amazon SES.
    */
  var Rejects: js.UndefOr[Counter] = js.undefined
  
  /**
    * Time of the data point.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.sesMod.Timestamp] = js.undefined
}
object SendDataPoint {
  
  @scala.inline
  def apply(): SendDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDataPoint]
  }
  
  @scala.inline
  implicit class SendDataPointMutableBuilder[Self <: SendDataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounces(value: Counter): Self = StObject.set(x, "Bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesUndefined: Self = StObject.set(x, "Bounces", js.undefined)
    
    @scala.inline
    def setComplaints(value: Counter): Self = StObject.set(x, "Complaints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplaintsUndefined: Self = StObject.set(x, "Complaints", js.undefined)
    
    @scala.inline
    def setDeliveryAttempts(value: Counter): Self = StObject.set(x, "DeliveryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryAttemptsUndefined: Self = StObject.set(x, "DeliveryAttempts", js.undefined)
    
    @scala.inline
    def setRejects(value: Counter): Self = StObject.set(x, "Rejects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectsUndefined: Self = StObject.set(x, "Rejects", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
