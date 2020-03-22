package typings.broFs

import typings.broFs.mod.TextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeTextType extends js.Object {
  var `type`: js.UndefOr[TextType] = js.undefined
}

object AnonTypeTextType {
  @scala.inline
  def apply(`type`: TextType = null): AnonTypeTextType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeTextType]
  }
}

