package typings
package cordovaDashPluginDashDeviceDashOrientationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CompassHeading object is returned to the compassSuccess callback function. */
trait CompassHeading extends js.Object {
  /** The deviation in degrees between the reported heading and the true heading. */
  var headingAccuracy: scala.Double
  /** The heading in degrees from 0-359.99 at a single moment in time. */
  var magneticHeading: scala.Double
  /** The time at which this heading was determined. */
  var timestamp: scala.Double
  /** The heading relative to the geographic North Pole in degrees 0-359.99 at a single moment in time. A negative value indicates that the true heading can't be determined. */
  var trueHeading: scala.Double
}

object CompassHeading {
  @scala.inline
  def apply(
    headingAccuracy: scala.Double,
    magneticHeading: scala.Double,
    timestamp: scala.Double,
    trueHeading: scala.Double
  ): CompassHeading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headingAccuracy")(headingAccuracy)
    __obj.updateDynamic("magneticHeading")(magneticHeading)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("trueHeading")(trueHeading)
    __obj.asInstanceOf[CompassHeading]
  }
}

