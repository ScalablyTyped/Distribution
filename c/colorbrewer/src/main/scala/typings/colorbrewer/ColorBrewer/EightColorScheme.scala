package typings.colorbrewer.ColorBrewer

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EightColorScheme extends ColorScheme {
  var `3`: js.Tuple3[String, String, String]
  var `4`: js.Tuple4[String, String, String, String]
  var `5`: js.Tuple5[String, String, String, String, String]
  var `6`: js.Tuple6[String, String, String, String, String, String]
  var `7`: js.Tuple7[String, String, String, String, String, String, String]
  var `8`: js.Tuple8[String, String, String, String, String, String, String, String]
}

object EightColorScheme {
  @scala.inline
  def apply(
    `3`: js.Tuple3[String, String, String],
    `4`: js.Tuple4[String, String, String, String],
    `5`: js.Tuple5[String, String, String, String, String],
    `6`: js.Tuple6[String, String, String, String, String, String],
    `7`: js.Tuple7[String, String, String, String, String, String, String],
    `8`: js.Tuple8[String, String, String, String, String, String, String, String],
    NumberDictionary: NumberDictionary[js.Array[String]] = null
  ): EightColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("3")(`3`)
    __obj.updateDynamic("4")(`4`)
    __obj.updateDynamic("5")(`5`)
    __obj.updateDynamic("6")(`6`)
    __obj.updateDynamic("7")(`7`)
    __obj.updateDynamic("8")(`8`)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[EightColorScheme]
  }
}

