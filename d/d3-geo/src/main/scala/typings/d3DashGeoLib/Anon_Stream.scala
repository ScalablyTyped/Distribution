package typings
package d3DashGeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stream extends js.Object {
  var stream: d3DashGeoLib.d3DashGeoMod.GeoStream
}

object Anon_Stream {
  @scala.inline
  def apply(stream: d3DashGeoLib.d3DashGeoMod.GeoStream): Anon_Stream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_Stream]
  }
}

