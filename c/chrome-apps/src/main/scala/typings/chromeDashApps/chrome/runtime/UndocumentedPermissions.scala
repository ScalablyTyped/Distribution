package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Undocumented but used permissions */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.appDOTwindowDOTime
  - typings.chromeDashApps.chromeDashAppsStrings.fullscreen
  - typings.chromeDashApps.chromeDashAppsStrings.overrideEscFullscreen
*/
trait UndocumentedPermissions extends js.Object

object UndocumentedPermissions {
  @scala.inline
  def appDOTwindowDOTime: typings.chromeDashApps.chromeDashAppsStrings.appDOTwindowDOTime = this.cast("app.window.ime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typings.chromeDashApps.chromeDashAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def overrideEscFullscreen: typings.chromeDashApps.chromeDashAppsStrings.overrideEscFullscreen = this.cast("overrideEscFullscreen")
}

