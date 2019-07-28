package typings.d3DashGeo

import typings.d3DashGeo.d3DashGeoMod.GeoStream
import typings.d3DashGeo.d3DashGeoMod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream): T with GeoStream
}

object Anon_S {
  @scala.inline
  def apply[T /* <: GeoTransformPrototype */](stream: GeoStream => T with GeoStream): Anon_S[T] = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
  
    __obj.asInstanceOf[Anon_S[T]]
  }
}

