package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRFieldOfView extends js.Object {
  val downDegrees: scala.Double
  val leftDegrees: scala.Double
  val rightDegrees: scala.Double
  val upDegrees: scala.Double
}

object VRFieldOfView {
  @scala.inline
  def apply(
    downDegrees: scala.Double,
    leftDegrees: scala.Double,
    rightDegrees: scala.Double,
    upDegrees: scala.Double
  ): VRFieldOfView = {
    val __obj = js.Dynamic.literal(downDegrees = downDegrees, leftDegrees = leftDegrees, rightDegrees = rightDegrees, upDegrees = upDegrees)
  
    __obj.asInstanceOf[VRFieldOfView]
  }
}

