package typings.chromeDashApps

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.chromeNs.webViewRequestNs.DeclarativeWebRequestConditionsList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /** Arguments, see original condition docs in chrome.webViewRequest */
/* key */ StringDictionary[js.Any | js.Array[_]] {
  /** Condition */
  var `type`: DeclarativeWebRequestConditionsList
}

object Anon_Key {
  @scala.inline
  def apply(
    `type`: DeclarativeWebRequestConditionsList,
    StringDictionary: /** Arguments, see original condition docs in chrome.webViewRequest */
  /* key */ StringDictionary[js.Any | js.Array[_]] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

