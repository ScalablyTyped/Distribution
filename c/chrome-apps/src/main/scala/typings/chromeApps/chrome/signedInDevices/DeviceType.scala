package typings.chromeApps.chrome.signedInDevices

import typings.chromeApps.chromeAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.desktop_or_laptop
  - typings.chromeApps.chromeAppsStrings.phone
  - typings.chromeApps.chromeAppsStrings.tablet
  - typings.chromeApps.chromeAppsStrings.unknown_
*/
trait DeviceType extends js.Object

object DeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop_or_laptop: typings.chromeApps.chromeAppsStrings.desktop_or_laptop = this.cast("desktop_or_laptop")
  @scala.inline
  def phone: typings.chromeApps.chromeAppsStrings.phone = this.cast("phone")
  @scala.inline
  def tablet: typings.chromeApps.chromeAppsStrings.tablet = this.cast("tablet")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

