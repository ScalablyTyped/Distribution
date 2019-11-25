package typings.chromeDashApps.chrome.signedInDevices

import typings.chromeDashApps.chromeDashAppsStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.desktop_or_laptop
  - typings.chromeDashApps.chromeDashAppsStrings.phone
  - typings.chromeDashApps.chromeDashAppsStrings.tablet
  - typings.chromeDashApps.chromeDashAppsStrings.unknown_
*/
trait DeviceType extends js.Object

object DeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop_or_laptop: typings.chromeDashApps.chromeDashAppsStrings.desktop_or_laptop = this.cast("desktop_or_laptop")
  @scala.inline
  def phone: typings.chromeDashApps.chromeDashAppsStrings.phone = this.cast("phone")
  @scala.inline
  def tablet: typings.chromeDashApps.chromeDashAppsStrings.tablet = this.cast("tablet")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

