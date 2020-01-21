package typings.chromeApps.chrome.accessibilityFeatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.regular
  - typings.chromeApps.chromeAppsStrings.regular_only
  - typings.chromeApps.chromeAppsStrings.incognito_persistent
  - typings.chromeApps.chromeAppsStrings.incognito_session_only
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incognito_persistent: typings.chromeApps.chromeAppsStrings.incognito_persistent = this.cast("incognito_persistent")
  @scala.inline
  def incognito_session_only: typings.chromeApps.chromeAppsStrings.incognito_session_only = this.cast("incognito_session_only")
  @scala.inline
  def regular: typings.chromeApps.chromeAppsStrings.regular = this.cast("regular")
  @scala.inline
  def regular_only: typings.chromeApps.chromeAppsStrings.regular_only = this.cast("regular_only")
}

