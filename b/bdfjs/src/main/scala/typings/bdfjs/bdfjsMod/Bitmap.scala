package typings.bdfjs.bdfjsMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bitmap
  extends /* row */ NumberDictionary[js.Array[Double]] {
  var height: Double
  var width: Double
}

object Bitmap {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    NumberDictionary: /* row */ NumberDictionary[js.Array[Double]] = null
  ): Bitmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Bitmap]
  }
}

