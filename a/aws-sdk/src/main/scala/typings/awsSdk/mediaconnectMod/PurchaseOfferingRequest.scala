package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseOfferingRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the offering.
    */
  var OfferingArn: string = js.native
  
  /**
    * The name that you want to use for the reservation.
    */
  var ReservationName: string = js.native
  
  /**
    * The date and time that you want the reservation to begin, in Coordinated Universal Time (UTC). You can specify any date and time between 12:00am on the first day of the current month to the current time on today's date, inclusive. Specify the start in a 24-hour notation. Use the following format: YYYY-MM-DDTHH:mm:SSZ, where T and Z are literal characters. For example, to specify 11:30pm on March 5, 2020, enter 2020-03-05T23:30:00Z.
    */
  var Start: string = js.native
}
object PurchaseOfferingRequest {
  
  @scala.inline
  def apply(OfferingArn: string, ReservationName: string, Start: string): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingArn = OfferingArn.asInstanceOf[js.Any], ReservationName = ReservationName.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  
  @scala.inline
  implicit class PurchaseOfferingRequestMutableBuilder[Self <: PurchaseOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingArn(value: string): Self = StObject.set(x, "OfferingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationName(value: string): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
