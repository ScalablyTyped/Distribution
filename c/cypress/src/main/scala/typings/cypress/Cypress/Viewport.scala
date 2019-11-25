package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var viewportHeight: Double
  var viewportWidth: Double
}

object Viewport {
  @scala.inline
  def apply(viewportHeight: Double, viewportWidth: Double): Viewport = {
    val __obj = js.Dynamic.literal(viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Viewport]
  }
}

