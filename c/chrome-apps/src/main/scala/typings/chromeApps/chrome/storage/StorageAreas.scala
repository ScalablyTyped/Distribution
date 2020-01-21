package typings.chromeApps.chrome.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.local
  - typings.chromeApps.chromeAppsStrings.sync
  - typings.chromeApps.chromeAppsStrings.managed
*/
trait StorageAreas extends js.Object

object StorageAreas {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typings.chromeApps.chromeAppsStrings.local = this.cast("local")
  @scala.inline
  def managed: typings.chromeApps.chromeAppsStrings.managed = this.cast("managed")
  @scala.inline
  def sync: typings.chromeApps.chromeAppsStrings.sync = this.cast("sync")
}

