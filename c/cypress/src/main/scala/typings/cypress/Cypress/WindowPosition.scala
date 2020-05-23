package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowPosition extends js.Object {
  var left: Double
  var leftCenter: Double
  var top: Double
  var topCenter: Double
}

object WindowPosition {
  @scala.inline
  def apply(left: Double, leftCenter: Double, top: Double, topCenter: Double): WindowPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPosition]
  }
}

