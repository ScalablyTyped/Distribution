package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offering extends js.Object {
  
  /**
    * The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
    */
  var CurrencyCode: string = js.native
  
  /**
    * The length of time that your reservation would be active.
    */
  var Duration: integer = js.native
  
  /**
    * The unit of measurement for the duration of the offering.
    */
  var DurationUnits: typings.awsSdk.mediaconnectMod.DurationUnits = js.native
  
  /**
    * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
    */
  var OfferingArn: string = js.native
  
  /**
    * A description of the offering.
    */
  var OfferingDescription: string = js.native
  
  /**
    * The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
    */
  var PricePerUnit: string = js.native
  
  /**
    * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the rate.
    */
  var PriceUnits: typings.awsSdk.mediaconnectMod.PriceUnits = js.native
  
  /**
    * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
    */
  var ResourceSpecification: typings.awsSdk.mediaconnectMod.ResourceSpecification = js.native
}
object Offering {
  
  @scala.inline
  def apply(
    CurrencyCode: string,
    Duration: integer,
    DurationUnits: DurationUnits,
    OfferingArn: string,
    OfferingDescription: string,
    PricePerUnit: string,
    PriceUnits: PriceUnits,
    ResourceSpecification: ResourceSpecification
  ): Offering = {
    val __obj = js.Dynamic.literal(CurrencyCode = CurrencyCode.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], DurationUnits = DurationUnits.asInstanceOf[js.Any], OfferingArn = OfferingArn.asInstanceOf[js.Any], OfferingDescription = OfferingDescription.asInstanceOf[js.Any], PricePerUnit = PricePerUnit.asInstanceOf[js.Any], PriceUnits = PriceUnits.asInstanceOf[js.Any], ResourceSpecification = ResourceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offering]
  }
  
  @scala.inline
  implicit class OfferingOps[Self <: Offering] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: string): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUnits(value: DurationUnits): Self = this.set("DurationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingArn(value: string): Self = this.set("OfferingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingDescription(value: string): Self = this.set("OfferingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricePerUnit(value: string): Self = this.set("PricePerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUnits(value: PriceUnits): Self = this.set("PriceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpecification(value: ResourceSpecification): Self = this.set("ResourceSpecification", value.asInstanceOf[js.Any])
  }
}
