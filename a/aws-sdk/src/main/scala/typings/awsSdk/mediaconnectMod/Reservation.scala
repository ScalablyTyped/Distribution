package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reservation extends StObject {
  
  /**
    * The type of currency that is used for billing. The currencyCode used for your reservation is US dollars.
    */
  var CurrencyCode: string
  
  /**
    * The length of time that this reservation is active. MediaConnect defines this value in the offering.
    */
  var Duration: integer
  
  /**
    * The unit of measurement for the duration of the reservation. MediaConnect defines this value in the offering.
    */
  var DurationUnits: typings.awsSdk.mediaconnectMod.DurationUnits
  
  /**
    * The day and time that this reservation expires. This value is calculated based on the start date and time that you set and the offering's duration.
    */
  var End: string
  
  /**
    * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
    */
  var OfferingArn: string
  
  /**
    * A description of the offering. MediaConnect defines this value in the offering.
    */
  var OfferingDescription: string
  
  /**
    * The cost of a single unit. This value, in combination with priceUnits, makes up the rate. MediaConnect defines this value in the offering.
    */
  var PricePerUnit: string
  
  /**
    * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the rate. MediaConnect defines this value in the offering.
    */
  var PriceUnits: typings.awsSdk.mediaconnectMod.PriceUnits
  
  /**
    * The Amazon Resource Name (ARN) that MediaConnect assigns to the reservation when you purchase an offering.
    */
  var ReservationArn: string
  
  /**
    * The name that you assigned to the reservation when you purchased the offering.
    */
  var ReservationName: string
  
  /**
    * The status of your reservation.
    */
  var ReservationState: typings.awsSdk.mediaconnectMod.ReservationState
  
  /**
    * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering. MediaConnect defines the values that make up the resourceSpecification in the offering.
    */
  var ResourceSpecification: typings.awsSdk.mediaconnectMod.ResourceSpecification
  
  /**
    * The day and time that the reservation becomes active. You set this value when you purchase the offering.
    */
  var Start: string
}
object Reservation {
  
  inline def apply(
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
  
  extension [Self <: Reservation](x: Self) {
    
    inline def setCurrencyCode(value: string): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUnits(value: DurationUnits): Self = StObject.set(x, "DurationUnits", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: string): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setOfferingArn(value: string): Self = StObject.set(x, "OfferingArn", value.asInstanceOf[js.Any])
    
    inline def setOfferingDescription(value: string): Self = StObject.set(x, "OfferingDescription", value.asInstanceOf[js.Any])
    
    inline def setPricePerUnit(value: string): Self = StObject.set(x, "PricePerUnit", value.asInstanceOf[js.Any])
    
    inline def setPriceUnits(value: PriceUnits): Self = StObject.set(x, "PriceUnits", value.asInstanceOf[js.Any])
    
    inline def setReservationArn(value: string): Self = StObject.set(x, "ReservationArn", value.asInstanceOf[js.Any])
    
    inline def setReservationName(value: string): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservationState(value: ReservationState): Self = StObject.set(x, "ReservationState", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecification(value: ResourceSpecification): Self = StObject.set(x, "ResourceSpecification", value.asInstanceOf[js.Any])
    
    inline def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
