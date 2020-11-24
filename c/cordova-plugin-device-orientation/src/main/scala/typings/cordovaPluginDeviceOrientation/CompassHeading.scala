package typings.cordovaPluginDeviceOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CompassHeading object is returned to the compassSuccess callback function. */
@js.native
trait CompassHeading extends js.Object {
  
  /** The deviation in degrees between the reported heading and the true heading. */
  var headingAccuracy: Double = js.native
  
  /** The heading in degrees from 0-359.99 at a single moment in time. */
  var magneticHeading: Double = js.native
  
  /** The time at which this heading was determined. */
  var timestamp: Double = js.native
  
  /** The heading relative to the geographic North Pole in degrees 0-359.99 at a single moment in time. A negative value indicates that the true heading can't be determined. */
  var trueHeading: Double = js.native
}
object CompassHeading {
  
  @scala.inline
  def apply(headingAccuracy: Double, magneticHeading: Double, timestamp: Double, trueHeading: Double): CompassHeading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], magneticHeading = magneticHeading.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassHeading]
  }
  
  @scala.inline
  implicit class CompassHeadingOps[Self <: CompassHeading] (val x: Self) extends AnyVal {
    
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
    def setHeadingAccuracy(value: Double): Self = this.set("headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = this.set("magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueHeading(value: Double): Self = this.set("trueHeading", value.asInstanceOf[js.Any])
  }
}
