package typings.chromeDashApps.chrome.signedInDevices

import typings.chromeDashApps.chromeDashAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.win
  - typings.chromeDashApps.chromeDashAppsStrings.mac
  - typings.chromeDashApps.chromeDashAppsStrings.linux
  - typings.chromeDashApps.chromeDashAppsStrings.chrome_os
  - typings.chromeDashApps.chromeDashAppsStrings.android
  - typings.chromeDashApps.chromeDashAppsStrings.ios
  - typings.chromeDashApps.chromeDashAppsStrings.unknown_
*/
trait OS extends js.Object

object OS {
  @scala.inline
  def android: typings.chromeDashApps.chromeDashAppsStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chrome_os: typings.chromeDashApps.chromeDashAppsStrings.chrome_os = this.cast("chrome_os")
  @scala.inline
  def ios: typings.chromeDashApps.chromeDashAppsStrings.ios = this.cast("ios")
  @scala.inline
  def linux: typings.chromeDashApps.chromeDashAppsStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typings.chromeDashApps.chromeDashAppsStrings.mac = this.cast("mac")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def win: typings.chromeDashApps.chromeDashAppsStrings.win = this.cast("win")
}

