package typings.bugsnagJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyType
  extends /* key */ StringDictionary[js.Any] {
  var `type`: String
}

object AnonKeyType {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKeyType]
  }
}

