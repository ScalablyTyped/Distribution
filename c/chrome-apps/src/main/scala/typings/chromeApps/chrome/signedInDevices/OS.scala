package typings.chromeApps.chrome.signedInDevices

import typings.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.win
  - typings.chromeApps.chromeAppsStrings.mac
  - typings.chromeApps.chromeAppsStrings.linux
  - typings.chromeApps.chromeAppsStrings.chrome_os
  - typings.chromeApps.chromeAppsStrings.android
  - typings.chromeApps.chromeAppsStrings.ios
  - typings.chromeApps.chromeAppsStrings.unknown_
*/
trait OS extends js.Object

object OS {
  @scala.inline
  def android: typings.chromeApps.chromeAppsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chrome_os: typings.chromeApps.chromeAppsStrings.chrome_os = this.cast("chrome_os")
  @scala.inline
  def ios: typings.chromeApps.chromeAppsStrings.ios = this.cast("ios")
  @scala.inline
  def linux: typings.chromeApps.chromeAppsStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typings.chromeApps.chromeAppsStrings.mac = this.cast("mac")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def win: typings.chromeApps.chromeAppsStrings.win = this.cast("win")
}

