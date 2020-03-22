package typings.cypress.cypressMod.Cypress

import typings.cypress.ViewportPositionxnumberyn
import typings.cypress.WindowPositionxnumberynum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCoordinates extends js.Object {
  var fromAutWindow: WindowPositionxnumberynum
  var fromElViewport: ViewportPositionxnumberyn
  var fromElWindow: WindowPositionxnumberynum
  var height: Double
  var width: Double
}

object ElementCoordinates {
  @scala.inline
  def apply(
    fromAutWindow: WindowPositionxnumberynum,
    fromElViewport: ViewportPositionxnumberyn,
    fromElWindow: WindowPositionxnumberynum,
    height: Double,
    width: Double
  ): ElementCoordinates = {
    val __obj = js.Dynamic.literal(fromAutWindow = fromAutWindow.asInstanceOf[js.Any], fromElViewport = fromElViewport.asInstanceOf[js.Any], fromElWindow = fromElWindow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementCoordinates]
  }
}

