package typings.chromeApps.WebView.Events

import typings.chromeApps.chromeAppsStrings.filesystem_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.media
  - typings.chromeApps.chromeAppsStrings.geolocation
  - typings.chromeApps.chromeAppsStrings.pointerLock
  - typings.chromeApps.chromeAppsStrings.download
  - typings.chromeApps.chromeAppsStrings.loadplugin
  - typings.chromeApps.chromeAppsStrings.filesystem_
  - typings.chromeApps.chromeAppsStrings.fullscreen
*/
trait RequestedPermission extends js.Object

object RequestedPermission {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def download: typings.chromeApps.chromeAppsStrings.download = this.cast("download")
  @scala.inline
  def filesystem: filesystem_ = this.cast("filesystem")
  @scala.inline
  def fullscreen: typings.chromeApps.chromeAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def geolocation: typings.chromeApps.chromeAppsStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def loadplugin: typings.chromeApps.chromeAppsStrings.loadplugin = this.cast("loadplugin")
  @scala.inline
  def media: typings.chromeApps.chromeAppsStrings.media = this.cast("media")
  @scala.inline
  def pointerLock: typings.chromeApps.chromeAppsStrings.pointerLock = this.cast("pointerLock")
}

