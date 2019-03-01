package typings
package binDashPackLib.binDashPackMod.packNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The return value from the pack function. */
trait PackResult[T] extends js.Object {
  /** Height of the bounding box around all bins. */
  var height: scala.Double
  /** List of packed bins. */
  var items: js.Array[PackedItem[T]]
  /** Width of the bounding box around all bins. */
  var width: scala.Double
}

object PackResult {
  @scala.inline
  def apply[T](height: scala.Double, items: js.Array[PackedItem[T]], width: scala.Double): PackResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PackResult[T]]
  }
}

