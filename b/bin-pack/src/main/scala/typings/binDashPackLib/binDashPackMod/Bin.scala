package typings
package binDashPackLib.binDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the dimensions of a bin to pack. */
trait Bin extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object Bin {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Bin = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Bin]
  }
}

