package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reservation extends js.Object {
  
  /**
    * Unique reservation ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * Number of reserved resources
    */
  var Count: js.UndefOr[integer] = js.native
  
  /**
    * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
    */
  var CurrencyCode: js.UndefOr[string] = js.native
  
  /**
    * Lease duration, e.g. '12'
    */
  var Duration: js.UndefOr[integer] = js.native
  
  /**
    * Units for duration, e.g. 'MONTHS'
    */
  var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.native
  
  /**
    * Reservation UTC end date and time in ISO-8601 format, e.g. '2019-03-01T00:00:00'
    */
  var End: js.UndefOr[string] = js.native
  
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.native
  
  /**
    * User specified reservation name
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
    */
  var OfferingDescription: js.UndefOr[string] = js.native
  
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: js.UndefOr[string] = js.native
  
  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  var OfferingType: js.UndefOr[typings.awsSdk.medialiveMod.OfferingType] = js.native
  
  /**
    * AWS region, e.g. 'us-west-2'
    */
  var Region: js.UndefOr[string] = js.native
  
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: js.UndefOr[string] = js.native
  
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.native
  
  /**
    * Reservation UTC start date and time in ISO-8601 format, e.g. '2018-03-01T00:00:00'
    */
  var Start: js.UndefOr[string] = js.native
  
  /**
    * Current state of reservation, e.g. 'ACTIVE'
    */
  var State: js.UndefOr[ReservationState] = js.native
  
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.native
}
object Reservation {
  
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit class ReservationOps[Self <: Reservation] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCount(value: integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: string): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setDurationUnits(value: OfferingDurationUnits): Self = this.set("DurationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationUnits: Self = this.set("DurationUnits", js.undefined)
    
    @scala.inline
    def setEnd(value: string): Self = this.set("End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOfferingDescription(value: string): Self = this.set("OfferingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingDescription: Self = this.set("OfferingDescription", js.undefined)
    
    @scala.inline
    def setOfferingId(value: string): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingId: Self = this.set("OfferingId", js.undefined)
    
    @scala.inline
    def setOfferingType(value: OfferingType): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    
    @scala.inline
    def setRegion(value: string): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setReservationId(value: string): Self = this.set("ReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationId: Self = this.set("ReservationId", js.undefined)
    
    @scala.inline
    def setResourceSpecification(value: ReservationResourceSpecification): Self = this.set("ResourceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSpecification: Self = this.set("ResourceSpecification", js.undefined)
    
    @scala.inline
    def setStart(value: string): Self = this.set("Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
    
    @scala.inline
    def setState(value: ReservationState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
}
