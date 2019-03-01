package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmap extends js.Object {
  val height: scala.Double
  val width: scala.Double
  def close(): scala.Unit
}

object ImageBitmap {
  @scala.inline
  def apply(close: js.Function0[scala.Unit], height: scala.Double, width: scala.Double): ImageBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ImageBitmap]
  }
}

