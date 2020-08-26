package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Convertor extends js.Object {
  def translate(
    points: js.Array[Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit = js.native
}

object Convertor {
  @scala.inline
  def apply(translate: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => Unit): Convertor = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction4(translate))
    __obj.asInstanceOf[Convertor]
  }
  @scala.inline
  implicit class ConvertorOps[Self <: Convertor] (val x: Self) extends AnyVal {
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
    def setTranslate(value: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => Unit): Self = this.set("translate", js.Any.fromFunction4(value))
  }
  
}

