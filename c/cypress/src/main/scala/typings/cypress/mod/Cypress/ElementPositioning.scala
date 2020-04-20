package typings.cypress.mod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementPositioning extends js.Object {
  var fromAutWindow: WindowPosition
  var fromElViewport: ViewportPosition
  var fromElWindow: WindowPosition
  var height: Double
  var scrollLeft: Double
  var scrollTop: Double
  var width: Double
}

object ElementPositioning {
  @scala.inline
  def apply(
    fromAutWindow: WindowPosition,
    fromElViewport: ViewportPosition,
    fromElWindow: WindowPosition,
    height: Double,
    scrollLeft: Double,
    scrollTop: Double,
    width: Double
  ): ElementPositioning = {
    val __obj = js.Dynamic.literal(fromAutWindow = fromAutWindow.asInstanceOf[js.Any], fromElViewport = fromElViewport.asInstanceOf[js.Any], fromElWindow = fromElWindow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPositioning]
  }
}

