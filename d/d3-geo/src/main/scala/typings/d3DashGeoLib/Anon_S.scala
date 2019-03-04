package typings
package d3DashGeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S[T /* <: d3DashGeoLib.d3DashGeoMod.GeoTransformPrototype */] extends js.Object {
  def stream(s: d3DashGeoLib.d3DashGeoMod.GeoStream): T with d3DashGeoLib.d3DashGeoMod.GeoStream
}

object Anon_S {
  @scala.inline
  def apply[T /* <: d3DashGeoLib.d3DashGeoMod.GeoTransformPrototype */](
    stream: js.Function1[d3DashGeoLib.d3DashGeoMod.GeoStream, T with d3DashGeoLib.d3DashGeoMod.GeoStream]
  ): Anon_S[T] = {
    val __obj = js.Dynamic.literal(stream = stream)
  
    __obj.asInstanceOf[Anon_S[T]]
  }
}

