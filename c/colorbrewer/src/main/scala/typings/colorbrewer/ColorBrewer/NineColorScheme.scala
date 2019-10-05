package typings.colorbrewer.ColorBrewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NineColorScheme extends EightColorScheme {
  var `9`: js.Tuple9[String, String, String, String, String, String, String, String, String]
}

object NineColorScheme {
  @scala.inline
  def apply(
    `3`: js.Tuple3[String, String, String],
    `4`: js.Tuple4[String, String, String, String],
    `5`: js.Tuple5[String, String, String, String, String],
    `6`: js.Tuple6[String, String, String, String, String, String],
    `7`: js.Tuple7[String, String, String, String, String, String, String],
    `8`: js.Tuple8[String, String, String, String, String, String, String, String],
    `9`: js.Tuple9[String, String, String, String, String, String, String, String, String]
  ): NineColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("3")(`3`)
    __obj.updateDynamic("4")(`4`)
    __obj.updateDynamic("5")(`5`)
    __obj.updateDynamic("6")(`6`)
    __obj.updateDynamic("7")(`7`)
    __obj.updateDynamic("8")(`8`)
    __obj.updateDynamic("9")(`9`)
    __obj.asInstanceOf[NineColorScheme]
  }
}

