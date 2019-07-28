package typings.bugsnagDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyType
  extends /* key */ StringDictionary[js.Any] {
  var `type`: String
}

object Anon_KeyType {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_KeyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_KeyType]
  }
}

