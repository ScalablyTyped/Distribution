package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var left: Double
  var top: Double
}

object Offset {
  @scala.inline
  def apply(left: Double, top: Double): Offset = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[Offset]
  }
}

