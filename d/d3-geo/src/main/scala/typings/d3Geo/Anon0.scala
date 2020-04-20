package typings.d3Geo

import typings.d3Geo.mod.GeoStream_
import typings.d3Geo.mod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream_): T with GeoStream_
}

object Anon0 {
  @scala.inline
  def apply[T /* <: GeoTransformPrototype */](stream: GeoStream_ => T with GeoStream_): Anon0[T] = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[Anon0[T]]
  }
}

