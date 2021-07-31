package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offering extends StObject {
  
  /**
    * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
    */
  var CurrencyCode: js.UndefOr[string] = js.undefined
  
  /**
    * Lease duration, e.g. '12'
    */
  var Duration: js.UndefOr[integer] = js.undefined
  
  /**
    * Units for duration, e.g. 'MONTHS'
    */
  var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
  
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[double] = js.undefined
  
  /**
    * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
    */
  var OfferingDescription: js.UndefOr[string] = js.undefined
  
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: js.UndefOr[string] = js.undefined
  
  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  var OfferingType: js.UndefOr[typings.awsSdk.medialiveMod.OfferingType] = js.undefined
  
  /**
    * AWS region, e.g. 'us-west-2'
    */
  var Region: js.UndefOr[string] = js.undefined
  
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
  
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[double] = js.undefined
}
object Offering {
  
  @scala.inline
  def apply(): Offering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offering]
  }
  
  @scala.inline
  implicit class OfferingMutableBuilder[Self <: Offering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: string): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setDurationUnits(value: OfferingDurationUnits): Self = StObject.set(x, "DurationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUnitsUndefined: Self = StObject.set(x, "DurationUnits", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    @scala.inline
    def setOfferingDescription(value: string): Self = StObject.set(x, "OfferingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingDescriptionUndefined: Self = StObject.set(x, "OfferingDescription", js.undefined)
    
    @scala.inline
    def setOfferingId(value: string): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
    @scala.inline
    def setOfferingType(value: OfferingType): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    @scala.inline
    def setRegion(value: string): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResourceSpecification(value: ReservationResourceSpecification): Self = StObject.set(x, "ResourceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpecificationUndefined: Self = StObject.set(x, "ResourceSpecification", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
