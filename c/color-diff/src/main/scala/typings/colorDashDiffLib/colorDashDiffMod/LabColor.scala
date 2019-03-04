package typings
package colorDashDiffLib.colorDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabColor extends js.Object {
  var L: scala.Double
  var a: scala.Double
  var b: scala.Double
}

object LabColor {
  @scala.inline
  def apply(L: scala.Double, a: scala.Double, b: scala.Double): LabColor = {
    val __obj = js.Dynamic.literal(L = L, a = a, b = b)
  
    __obj.asInstanceOf[LabColor]
  }
}

