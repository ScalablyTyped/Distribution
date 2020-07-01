package typings.d3Geo.anon

import typings.d3Geo.mod.GeoStream_
import typings.d3Geo.mod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream_): T with GeoStream_
}

object `0` {
  @scala.inline
  def apply[/* <: typings.d3Geo.mod.GeoTransformPrototype */ T](stream: GeoStream_ => T with GeoStream_): `0`[T] = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[`0`[T]]
  }
}

