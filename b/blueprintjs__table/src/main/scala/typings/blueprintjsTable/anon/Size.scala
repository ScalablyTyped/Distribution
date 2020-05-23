package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var size: Double
  var unclampedSize: Double
}

object Size {
  @scala.inline
  def apply(size: Double, unclampedSize: Double): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], unclampedSize = unclampedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

