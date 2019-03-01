package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /** Arguments, see original condition docs in chrome.webViewRequest */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]] {
  /** Condition */
  var `type`: chromeDashAppsLib.chromeNs.webViewRequestNs.DeclarativeWebRequestConditionsList
}

object Anon_Key {
  @scala.inline
  def apply(
    `type`: chromeDashAppsLib.chromeNs.webViewRequestNs.DeclarativeWebRequestConditionsList,
    StringDictionary: /** Arguments, see original condition docs in chrome.webViewRequest */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

