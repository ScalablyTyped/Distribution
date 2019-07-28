package typings.colorbrewer.ColorBrewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwelveColorScheme extends ElevenColorScheme {
  var `12`: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
}

object TwelveColorScheme {
  @scala.inline
  def apply(
    `10`: js.Tuple10[String, String, String, String, String, String, String, String, String, String],
    `11`: js.Tuple11[String, String, String, String, String, String, String, String, String, String, String],
    `12`: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    `3`: js.Tuple3[String, String, String],
    `4`: js.Tuple4[String, String, String, String],
    `5`: js.Tuple5[String, String, String, String, String],
    `6`: js.Tuple6[String, String, String, String, String, String],
    `7`: js.Tuple7[String, String, String, String, String, String, String],
    `8`: js.Tuple8[String, String, String, String, String, String, String, String],
    `9`: js.Tuple9[String, String, String, String, String, String, String, String, String]
  ): TwelveColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("10")(`10`)
    __obj.updateDynamic("11")(`11`)
    __obj.updateDynamic("12")(`12`)
    __obj.updateDynamic("3")(`3`)
    __obj.updateDynamic("4")(`4`)
    __obj.updateDynamic("5")(`5`)
    __obj.updateDynamic("6")(`6`)
    __obj.updateDynamic("7")(`7`)
    __obj.updateDynamic("8")(`8`)
    __obj.updateDynamic("9")(`9`)
    __obj.asInstanceOf[TwelveColorScheme]
  }
}

