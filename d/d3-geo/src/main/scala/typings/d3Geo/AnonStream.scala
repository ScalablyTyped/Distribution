package typings.d3Geo

import typings.d3Geo.mod.GeoStream_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStream extends js.Object {
  var stream: GeoStream_
}

object AnonStream {
  @scala.inline
  def apply(stream: GeoStream_): AnonStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStream]
  }
}

