package typings.d3Geo.anon

import typings.d3Geo.mod.GeoStream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var stream: GeoStream_
}

object Stream {
  @scala.inline
  def apply(stream: GeoStream_): Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

