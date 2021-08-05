package typings.cordovaPluginDeviceOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CompassHeading object is returned to the compassSuccess callback function. */
trait CompassHeading extends StObject {
  
  /** The deviation in degrees between the reported heading and the true heading. */
  var headingAccuracy: Double
  
  /** The heading in degrees from 0-359.99 at a single moment in time. */
  var magneticHeading: Double
  
  /** The time at which this heading was determined. */
  var timestamp: Double
  
  /** The heading relative to the geographic North Pole in degrees 0-359.99 at a single moment in time. A negative value indicates that the true heading can't be determined. */
  var trueHeading: Double
}
object CompassHeading {
  
  inline def apply(headingAccuracy: Double, magneticHeading: Double, timestamp: Double, trueHeading: Double): CompassHeading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], magneticHeading = magneticHeading.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassHeading]
  }
  
  extension [Self <: CompassHeading](x: Self) {
    
    inline def setHeadingAccuracy(value: Double): Self = StObject.set(x, "headingAccuracy", value.asInstanceOf[js.Any])
    
    inline def setMagneticHeading(value: Double): Self = StObject.set(x, "magneticHeading", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTrueHeading(value: Double): Self = StObject.set(x, "trueHeading", value.asInstanceOf[js.Any])
  }
}
