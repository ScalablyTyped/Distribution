package typings.cordovaDashPluginDashDeviceDashOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CompassHeading object is returned to the compassSuccess callback function. */
trait CompassHeading extends js.Object {
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
  @scala.inline
  def apply(headingAccuracy: Double, magneticHeading: Double, timestamp: Double, trueHeading: Double): CompassHeading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], magneticHeading = magneticHeading.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompassHeading]
  }
}

