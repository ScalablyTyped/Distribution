package typings.binDashPack.binDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The return value from the pack function. */
trait PackResult[T] extends js.Object {
  /** Height of the bounding box around all bins. */
  var height: Double
  /** List of packed bins. */
  var items: js.Array[PackedItem[T]]
  /** Width of the bounding box around all bins. */
  var width: Double
}

object PackResult {
  @scala.inline
  def apply[T](height: Double, items: js.Array[PackedItem[T]], width: Double): PackResult[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackResult[T]]
  }
}

