package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bitmap
  extends /* row */ org.scalablytyped.runtime.NumberDictionary[js.Array[scala.Double]] {
  var height: scala.Double
  var width: scala.Double
}

object Bitmap {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    NumberDictionary: /* row */ org.scalablytyped.runtime.NumberDictionary[js.Array[scala.Double]] = null
  ): Bitmap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Bitmap]
  }
}

