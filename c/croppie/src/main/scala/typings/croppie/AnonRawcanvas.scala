package typings.croppie

import typings.croppie.croppieStrings.rawcanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRawcanvas extends js.Object {
  var `type`: rawcanvas
}

object AnonRawcanvas {
  @scala.inline
  def apply(`type`: rawcanvas): AnonRawcanvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRawcanvas]
  }
}

