package typings.colorDashDiff.colorDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabColor extends js.Object {
  var L: Double
  var a: Double
  var b: Double
}

object LabColor {
  @scala.inline
  def apply(L: Double, a: Double, b: Double): LabColor = {
    val __obj = js.Dynamic.literal(L = L, a = a, b = b)
  
    __obj.asInstanceOf[LabColor]
  }
}

