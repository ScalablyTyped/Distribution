package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPSPointDimension extends StObject {
  
  /**
    * The GPS coordinates to measure distance from.
    */
  var Coordinates: GPSCoordinates
  
  /**
    * The range, in kilometers, from the GPS coordinates.
    */
  var RangeInKilometers: js.UndefOr[double] = js.undefined
}
object GPSPointDimension {
  
  @scala.inline
  def apply(Coordinates: GPSCoordinates): GPSPointDimension = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSPointDimension]
  }
  
  @scala.inline
  implicit class GPSPointDimensionMutableBuilder[Self <: GPSPointDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: GPSCoordinates): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeInKilometers(value: double): Self = StObject.set(x, "RangeInKilometers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeInKilometersUndefined: Self = StObject.set(x, "RangeInKilometers", js.undefined)
  }
}
