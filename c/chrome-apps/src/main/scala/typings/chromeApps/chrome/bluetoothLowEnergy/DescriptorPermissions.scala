package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.chromeAppsStrings.read_
import typings.chromeApps.chromeAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.read_
  - typings.chromeApps.chromeAppsStrings.write_
  - typings.chromeApps.chromeAppsStrings.encryptedRead
  - typings.chromeApps.chromeAppsStrings.encryptedWrite
  - typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead
  - typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite
*/
trait DescriptorPermissions extends js.Object

object DescriptorPermissions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptedAuthenticatedRead: typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead = this.cast("encryptedAuthenticatedRead")
  @scala.inline
  def encryptedAuthenticatedWrite: typings.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite = this.cast("encryptedAuthenticatedWrite")
  @scala.inline
  def encryptedRead: typings.chromeApps.chromeAppsStrings.encryptedRead = this.cast("encryptedRead")
  @scala.inline
  def encryptedWrite: typings.chromeApps.chromeAppsStrings.encryptedWrite = this.cast("encryptedWrite")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def write: write_ = this.cast("write")
}

