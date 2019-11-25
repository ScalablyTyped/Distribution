package typings.chromeDashApps.chrome.accessibilityFeatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.regular
  - typings.chromeDashApps.chromeDashAppsStrings.regular_only
  - typings.chromeDashApps.chromeDashAppsStrings.incognito_persistent
  - typings.chromeDashApps.chromeDashAppsStrings.incognito_session_only
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incognito_persistent: typings.chromeDashApps.chromeDashAppsStrings.incognito_persistent = this.cast("incognito_persistent")
  @scala.inline
  def incognito_session_only: typings.chromeDashApps.chromeDashAppsStrings.incognito_session_only = this.cast("incognito_session_only")
  @scala.inline
  def regular: typings.chromeDashApps.chromeDashAppsStrings.regular = this.cast("regular")
  @scala.inline
  def regular_only: typings.chromeDashApps.chromeDashAppsStrings.regular_only = this.cast("regular_only")
}

