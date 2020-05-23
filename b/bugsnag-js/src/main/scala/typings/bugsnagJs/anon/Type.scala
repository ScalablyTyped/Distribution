package typings.bugsnagJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type
  extends /* key */ StringDictionary[js.Any] {
  var `type`: String
}

object Type {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Type]
  }
}

