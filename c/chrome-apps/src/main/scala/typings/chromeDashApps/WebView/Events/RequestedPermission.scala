package typings.chromeDashApps.WebView.Events

import typings.chromeDashApps.chromeDashAppsStrings.filesystem_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.media
  - typings.chromeDashApps.chromeDashAppsStrings.geolocation
  - typings.chromeDashApps.chromeDashAppsStrings.pointerLock
  - typings.chromeDashApps.chromeDashAppsStrings.download
  - typings.chromeDashApps.chromeDashAppsStrings.loadplugin
  - typings.chromeDashApps.chromeDashAppsStrings.filesystem_
  - typings.chromeDashApps.chromeDashAppsStrings.fullscreen
*/
trait RequestedPermission extends js.Object

object RequestedPermission {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def download: typings.chromeDashApps.chromeDashAppsStrings.download = this.cast("download")
  @scala.inline
  def filesystem: filesystem_ = this.cast("filesystem")
  @scala.inline
  def fullscreen: typings.chromeDashApps.chromeDashAppsStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def geolocation: typings.chromeDashApps.chromeDashAppsStrings.geolocation = this.cast("geolocation")
  @scala.inline
  def loadplugin: typings.chromeDashApps.chromeDashAppsStrings.loadplugin = this.cast("loadplugin")
  @scala.inline
  def media: typings.chromeDashApps.chromeDashAppsStrings.media = this.cast("media")
  @scala.inline
  def pointerLock: typings.chromeDashApps.chromeDashAppsStrings.pointerLock = this.cast("pointerLock")
}

