package typings.croppie

import typings.croppie.croppieStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var `type`: html
}

object AnonHtml {
  @scala.inline
  def apply(`type`: html): AnonHtml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHtml]
  }
}

