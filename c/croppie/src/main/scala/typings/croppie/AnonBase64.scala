package typings.croppie

import typings.croppie.croppieStrings.base64
import typings.croppie.croppieStrings.canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64 extends js.Object {
  var `type`: base64 | canvas
}

object AnonBase64 {
  @scala.inline
  def apply(`type`: base64 | canvas): AnonBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase64]
  }
}

