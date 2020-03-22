package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cypress.cypress.Cypress.ViewportPosition & {  x  :number,   y  :number} */
trait ViewportPositionxnumberyn extends js.Object {
  var bottom: Double
  var left: Double
  var leftCenter: Double
  var right: Double
  var top: Double
  var topCenter: Double
  var x: Double
  var y: Double
}

object ViewportPositionxnumberyn {
  @scala.inline
  def apply(
    bottom: Double,
    left: Double,
    leftCenter: Double,
    right: Double,
    top: Double,
    topCenter: Double,
    x: Double,
    y: Double
  ): ViewportPositionxnumberyn = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportPositionxnumberyn]
  }
}

