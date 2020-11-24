package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOfferingResponse extends js.Object {
  
  /**
    * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
    */
  var Arn: js.UndefOr[string] = js.native
  
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
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.native
  
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
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.native
  
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.native
}
object DescribeOfferingResponse {
  
  @scala.inline
  def apply(): DescribeOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOfferingResponse]
  }
  
  @scala.inline
  implicit class DescribeOfferingResponseOps[Self <: DescribeOfferingResponse] (val x: Self) extends AnyVal {
    
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
    def setFixedPrice(value: double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    
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
    def setResourceSpecification(value: ReservationResourceSpecification): Self = this.set("ResourceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSpecification: Self = this.set("ResourceSpecification", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
}
