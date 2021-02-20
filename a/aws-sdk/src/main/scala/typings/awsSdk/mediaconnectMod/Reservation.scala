package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reservation extends StObject {
  
  /**
    * The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
    */
  var CurrencyCode: string = js.native
  
  /**
    * The length of time that this reservation is active. MediaConnect defines this value in the offering.
    */
  var Duration: integer = js.native
  
  /**
    * The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering.
    */
  var DurationUnits: typings.awsSdk.mediaconnectMod.DurationUnits = js.native
  
  /**
    * The day and time that this reservation expires. This value is calculated based on the start date and time that you set and the offering's duration.
    */
  var End: string = js.native
  
  /**
    * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
    */
  var OfferingArn: string = js.native
  
  /**
    * A description of the offering. MediaConnect defines this value in the offering.
    */
  var OfferingDescription: string = js.native
  
  /**
    * The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect defines this value in the offering.
    */
  var PricePerUnit: string = js.native
  
  /**
    * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the rate. MediaConnect defines this value in the offering.
    */
  var PriceUnits: typings.awsSdk.mediaconnectMod.PriceUnits = js.native
  
  /**
    * The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
    */
  var ReservationArn: string = js.native
  
  /**
    * The name that you assigned to the reservation when you purchased the offering.
    */
  var ReservationName: string = js.native
  
  /**
    * The status of your reservation.
    */
  var ReservationState: typings.awsSdk.mediaconnectMod.ReservationState = js.native
  
  /**
    * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering. MediaConnect defines the values that make up the resourceSpecification in the offering.
    */
  var ResourceSpecification: typings.awsSdk.mediaconnectMod.ResourceSpecification = js.native
  
  /**
    * The day and time that the reservation becomes active. You set this value when you purchase the offering.
    */
  var Start: string = js.native
}
object Reservation {
  
  @scala.inline
  def apply(
    CurrencyCode: string,
    Duration: integer,
    DurationUnits: DurationUnits,
    End: string,
    OfferingArn: string,
    OfferingDescription: string,
    PricePerUnit: string,
    PriceUnits: PriceUnits,
    ReservationArn: string,
    ReservationName: string,
    ReservationState: ReservationState,
    ResourceSpecification: ResourceSpecification,
    Start: string
  ): Reservation = {
    val __obj = js.Dynamic.literal(CurrencyCode = CurrencyCode.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], DurationUnits = DurationUnits.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], OfferingArn = OfferingArn.asInstanceOf[js.Any], OfferingDescription = OfferingDescription.asInstanceOf[js.Any], PricePerUnit = PricePerUnit.asInstanceOf[js.Any], PriceUnits = PriceUnits.asInstanceOf[js.Any], ReservationArn = ReservationArn.asInstanceOf[js.Any], ReservationName = ReservationName.asInstanceOf[js.Any], ReservationState = ReservationState.asInstanceOf[js.Any], ResourceSpecification = ResourceSpecification.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit class ReservationMutableBuilder[Self <: Reservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: string): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUnits(value: DurationUnits): Self = StObject.set(x, "DurationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: string): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingArn(value: string): Self = StObject.set(x, "OfferingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingDescription(value: string): Self = StObject.set(x, "OfferingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricePerUnit(value: string): Self = StObject.set(x, "PricePerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUnits(value: PriceUnits): Self = StObject.set(x, "PriceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationArn(value: string): Self = StObject.set(x, "ReservationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationName(value: string): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationState(value: ReservationState): Self = StObject.set(x, "ReservationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpecification(value: ResourceSpecification): Self = StObject.set(x, "ResourceSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
