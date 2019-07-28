package typings.cesium

import typings.cesium.cesiumMod.Color
import typings.cesium.cesiumMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvenColor extends js.Object {
  var evenColor: js.UndefOr[Color] = js.undefined
  var oddColor: js.UndefOr[Color] = js.undefined
  var repeat: js.UndefOr[Property] = js.undefined
}

object Anon_EvenColor {
  @scala.inline
  def apply(evenColor: Color = null, oddColor: Color = null, repeat: Property = null): Anon_EvenColor = {
    val __obj = js.Dynamic.literal()
    if (evenColor != null) __obj.updateDynamic("evenColor")(evenColor)
    if (oddColor != null) __obj.updateDynamic("oddColor")(oddColor)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    __obj.asInstanceOf[Anon_EvenColor]
  }
}

