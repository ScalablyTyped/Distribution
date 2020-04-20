package typings.carbonIconHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCx extends js.Object {
  var cx: String
  var cy: String
  var r: String
}

object AnonCx {
  @scala.inline
  def apply(cx: String, cy: String, r: String): AnonCx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCx]
  }
}

