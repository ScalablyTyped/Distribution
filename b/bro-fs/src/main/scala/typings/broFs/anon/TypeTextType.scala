package typings.broFs.anon

import typings.broFs.mod.TextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeTextType extends js.Object {
  var `type`: js.UndefOr[TextType] = js.undefined
}

object TypeTextType {
  @scala.inline
  def apply(`type`: TextType = null): TypeTextType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeTextType]
  }
}

