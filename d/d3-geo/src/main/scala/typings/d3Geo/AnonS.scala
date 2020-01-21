package typings.d3Geo

import typings.d3Geo.mod.GeoStream_
import typings.d3Geo.mod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonS[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream_): T with GeoStream_
}

object AnonS {
  @scala.inline
  def apply[T /* <: GeoTransformPrototype */](stream: GeoStream_ => T with GeoStream_): AnonS[T] = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
  
    __obj.asInstanceOf[AnonS[T]]
  }
}

