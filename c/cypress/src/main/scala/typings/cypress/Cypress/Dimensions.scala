package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Dimensions {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Dimensions = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Dimensions]
  }
}

