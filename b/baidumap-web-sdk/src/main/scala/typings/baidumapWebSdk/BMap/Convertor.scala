package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Convertor extends js.Object {
  def translate(
    points: js.Array[Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit
}

object Convertor {
  @scala.inline
  def apply(translate: (js.Array[Point], Double, Double, js.Function1[/* result */ Points, Unit]) => Unit): Convertor = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction4(translate))
    __obj.asInstanceOf[Convertor]
  }
}

