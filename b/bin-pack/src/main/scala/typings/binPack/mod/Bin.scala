package typings.binPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the dimensions of a bin to pack. */
trait Bin extends js.Object {
  var height: Double
  var width: Double
}

object Bin {
  @scala.inline
  def apply(height: Double, width: Double): Bin = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
}

