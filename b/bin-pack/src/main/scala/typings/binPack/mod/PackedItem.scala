package typings.binPack.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackedItem[T]]
  }
}

