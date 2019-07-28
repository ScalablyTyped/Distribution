package typings.binDashPack.binDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the location of a packed bin. */
trait PackedItem[T] extends js.Object {
  /** Height of the bin. */
  var height: Double
  /** The original bin object. */
  var item: T
  /** Width of the bin. */
  var width: Double
  /** X coordinate of the packed bin. */
  var x: Double
  /** Y coordinate of the packed bin. */
  var y: Double
}

object PackedItem {
  @scala.inline
  def apply[T](height: Double, item: T, width: Double, x: Double, y: Double): PackedItem[T] = {
    val __obj = js.Dynamic.literal(height = height, item = item.asInstanceOf[js.Any], width = width, x = x, y = y)
  
    __obj.asInstanceOf[PackedItem[T]]
  }
}

