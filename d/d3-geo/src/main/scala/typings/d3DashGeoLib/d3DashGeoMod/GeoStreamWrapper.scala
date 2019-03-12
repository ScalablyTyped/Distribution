package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoStreamWrapper extends js.Object {
  /**
    * Returns a projection stream for the specified output stream. Any input geometry is projected before being streamed to the output stream.
    * A typical projection involves several geometry transformations: the input geometry is first converted to radians, rotated on three axes,
    * clipped to the small circle or cut along the antimeridian, and lastly projected to the plane with adaptive resampling, scale and translation.
    *
    * @param stream An input stream
    */
  def stream(stream: GeoStream): GeoStream
}

object GeoStreamWrapper {
  @scala.inline
  def apply(stream: GeoStream => GeoStream): GeoStreamWrapper = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
  
    __obj.asInstanceOf[GeoStreamWrapper]
  }
}

