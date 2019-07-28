package typings.binDashPack.binDashPackMod

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
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Bin]
  }
}

