package typings
package binDashPackLib.binDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the location of a packed bin. */
trait PackedItem[T] extends js.Object {
  /** Height of the bin. */
  var height: scala.Double
  /** The original bin object. */
  var item: T
  /** Width of the bin. */
  var width: scala.Double
  /** X coordinate of the packed bin. */
  var x: scala.Double
  /** Y coordinate of the packed bin. */
  var y: scala.Double
}

object PackedItem {
  @scala.inline
  def apply[T](height: scala.Double, item: T, width: scala.Double, x: scala.Double, y: scala.Double): PackedItem[T] = {
    val __obj = js.Dynamic.literal(height = height, item = item.asInstanceOf[js.Any], width = width, x = x, y = y)
  
    __obj.asInstanceOf[PackedItem[T]]
  }
}

