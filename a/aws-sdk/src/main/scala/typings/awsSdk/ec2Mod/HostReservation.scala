package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostReservation extends js.Object {
  
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
  implicit class HostReservationOps[Self <: HostReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setEnd(value: DateTime): Self = this.set("End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    
    @scala.inline
    def setHostIdSetVarargs(value: String*): Self = this.set("HostIdSet", js.Array(value :_*))
    
    @scala.inline
    def setHostIdSet(value: ResponseHostIdSet): Self = this.set("HostIdSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostIdSet: Self = this.set("HostIdSet", js.undefined)
    
    @scala.inline
    def setHostReservationId(value: String): Self = this.set("HostReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostReservationId: Self = this.set("HostReservationId", js.undefined)
    
    @scala.inline
    def setHourlyPrice(value: String): Self = this.set("HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlyPrice: Self = this.set("HourlyPrice", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    
    @scala.inline
    def setOfferingId(value: String): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingId: Self = this.set("OfferingId", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    
    @scala.inline
    def setStart(value: DateTime): Self = this.set("Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
    
    @scala.inline
    def setState(value: ReservationState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUpfrontPrice(value: String): Self = this.set("UpfrontPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpfrontPrice: Self = this.set("UpfrontPrice", js.undefined)
  }
}
