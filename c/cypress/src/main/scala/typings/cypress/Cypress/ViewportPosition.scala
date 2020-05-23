package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportPosition extends WindowPosition {
  var bottom: Double
  var right: Double
}

object ViewportPosition {
  @scala.inline
  def apply(bottom: Double, left: Double, leftCenter: Double, right: Double, top: Double, topCenter: Double): ViewportPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportPosition]
  }
}

