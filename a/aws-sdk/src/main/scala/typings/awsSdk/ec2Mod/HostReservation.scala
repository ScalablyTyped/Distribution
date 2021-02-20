package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostReservation extends StObject {
  
  /**
    * The number of Dedicated Hosts the reservation is associated with.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * The currency in which the upfrontPrice and hourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The length of the reservation's term, specified in seconds. Can be 31536000 (1 year) | 94608000 (3 years).
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The date and time that the reservation ends.
    */
  var End: js.UndefOr[DateTime] = js.native
  
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.native
  
  /**
    * The ID of the reservation that specifies the associated Dedicated Hosts.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  
  /**
    * The hourly price of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  
  /**
    * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same in order for it to benefit from the reservation.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  
  /**
    * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
    */
  var OfferingId: js.UndefOr[String] = js.native
  
  /**
    * The payment option selected for this reservation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.ec2Mod.PaymentOption] = js.native
  
  /**
    * The date and time that the reservation started.
    */
  var Start: js.UndefOr[DateTime] = js.native
  
  /**
    * The state of the reservation.
    */
  var State: js.UndefOr[ReservationState] = js.native
  
  /**
    * Any tags assigned to the Dedicated Host Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}
object HostReservation {
  
  @scala.inline
  def apply(): HostReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostReservation]
  }
  
  @scala.inline
  implicit class HostReservationMutableBuilder[Self <: HostReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setEnd(value: DateTime): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    @scala.inline
    def setHostIdSet(value: ResponseHostIdSet): Self = StObject.set(x, "HostIdSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdSetUndefined: Self = StObject.set(x, "HostIdSet", js.undefined)
    
    @scala.inline
    def setHostIdSetVarargs(value: String*): Self = StObject.set(x, "HostIdSet", js.Array(value :_*))
    
    @scala.inline
    def setHostReservationId(value: String): Self = StObject.set(x, "HostReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostReservationIdUndefined: Self = StObject.set(x, "HostReservationId", js.undefined)
    
    @scala.inline
    def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    @scala.inline
    def setOfferingId(value: String): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    @scala.inline
    def setStart(value: DateTime): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    @scala.inline
    def setState(value: ReservationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUpfrontPrice(value: String): Self = StObject.set(x, "UpfrontPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpfrontPriceUndefined: Self = StObject.set(x, "UpfrontPrice", js.undefined)
  }
}
