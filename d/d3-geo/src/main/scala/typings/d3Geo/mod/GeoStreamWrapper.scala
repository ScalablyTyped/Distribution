package typings.d3Geo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoStreamWrapper extends js.Object {
  /**
    * Returns a projection stream for the specified output stream. Any input geometry is projected before being streamed to the output stream.
    * A typical projection involves several geometry transformations: the input geometry is first converted to radians, rotated on three axes,
    * clipped to the small circle or cut along the antimeridian, and lastly projected to the plane with adaptive resampling, scale and translation.
    *
    * @param stream An input stream
    */
  def stream(stream: GeoStream_): GeoStream_ = js.native
}

object GeoStreamWrapper {
  @scala.inline
  def apply(stream: GeoStream_ => GeoStream_): GeoStreamWrapper = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[GeoStreamWrapper]
  }
  @scala.inline
  implicit class GeoStreamWrapperOps[Self <: GeoStreamWrapper] (val x: Self) extends AnyVal {
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
    def setStream(value: GeoStream_ => GeoStream_): Self = this.set("stream", js.Any.fromFunction1(value))
  }
  
}

