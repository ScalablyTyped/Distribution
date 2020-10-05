package typings.d3Geo.anon

import typings.d3Geo.mod.GeoStream_
import typings.d3Geo.mod.GeoTransformPrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[T /* <: GeoTransformPrototype */] extends js.Object {
  def stream(s: GeoStream_): T with GeoStream_ = js.native
}

object `0` {
  @scala.inline
  def apply[/* <: typings.d3Geo.mod.GeoTransformPrototype */ T](stream: GeoStream_ => T with GeoStream_): `0`[T] = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[`0`[T]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], /* <: typings.d3Geo.mod.GeoTransformPrototype */ T] (val x: Self with `0`[T]) extends AnyVal {
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
    def setStream(value: GeoStream_ => T with GeoStream_): Self = this.set("stream", js.Any.fromFunction1(value))
  }
  
}

