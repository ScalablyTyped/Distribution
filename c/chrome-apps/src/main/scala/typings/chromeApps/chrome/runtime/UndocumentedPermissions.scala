package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Undocumented but used permissions */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.appDotwindowDotime
  - typings.chromeApps.chromeAppsStrings.fullscreen
  - typings.chromeApps.chromeAppsStrings.overrideEscFullscreen
*/
trait UndocumentedPermissions extends js.Object

object UndocumentedPermissions {
  @scala.inline
  def appDotwindowDotime: typings.chromeApps.chromeAppsStrings.appDotwindowDotime = this.cast("app.window.ime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullscreen: typings.chromeApps.chromeAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def overrideEscFullscreen: typings.chromeApps.chromeAppsStrings.overrideEscFullscreen = this.cast("overrideEscFullscreen")
}

