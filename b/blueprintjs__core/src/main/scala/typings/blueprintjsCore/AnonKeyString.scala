package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyString extends js.Object {
  var key: js.UndefOr[String] = js.undefined
}

object AnonKeyString {
  @scala.inline
  def apply(key: String = null): AnonKeyString = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyString]
  }
}

