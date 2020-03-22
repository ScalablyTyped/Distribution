package typings.bugsnagJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType
  extends /* key */ StringDictionary[js.Any] {
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonType]
  }
}

