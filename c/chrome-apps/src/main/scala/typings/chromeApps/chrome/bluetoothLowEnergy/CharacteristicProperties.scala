package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.chromeAppsStrings.read_
import typings.chromeApps.chromeAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.broadcast
  - typings.chromeApps.chromeAppsStrings.read_
  - typings.chromeApps.chromeAppsStrings.writeWithoutResponse
  - typings.chromeApps.chromeAppsStrings.write_
  - typings.chromeApps.chromeAppsStrings.notify
  - typings.chromeApps.chromeAppsStrings.indicate
  - typings.chromeApps.chromeAppsStrings.authenticatedSignedWrites
  - typings.chromeApps.chromeAppsStrings.extendedProperties
  - typings.chromeApps.chromeAppsStrings.reliableWrite
  - typings.chromeApps.chromeAppsStrings.writableAuxiliaries
  - typings.chromeApps.chromeAppsStrings.encryptRead
  - typings.chromeApps.chromeAppsStrings.encryptWrite
  - typings.chromeApps.chromeAppsStrings.encryptAuthenticatedRead
  - typings.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite
*/
trait CharacteristicProperties extends js.Object

object CharacteristicProperties {
  @scala.inline
  def authenticatedSignedWrites: typings.chromeApps.chromeAppsStrings.authenticatedSignedWrites = this.cast("authenticatedSignedWrites")
  @scala.inline
  def broadcast: typings.chromeApps.chromeAppsStrings.broadcast = this.cast("broadcast")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptAuthenticatedRead: typings.chromeApps.chromeAppsStrings.encryptAuthenticatedRead = this.cast("encryptAuthenticatedRead")
  @scala.inline
  def encryptAuthenticatedWrite: typings.chromeApps.chromeAppsStrings.encryptAuthenticatedWrite = this.cast("encryptAuthenticatedWrite")
  @scala.inline
  def encryptRead: typings.chromeApps.chromeAppsStrings.encryptRead = this.cast("encryptRead")
  @scala.inline
  def encryptWrite: typings.chromeApps.chromeAppsStrings.encryptWrite = this.cast("encryptWrite")
  @scala.inline
  def extendedProperties: typings.chromeApps.chromeAppsStrings.extendedProperties = this.cast("extendedProperties")
  @scala.inline
  def indicate: typings.chromeApps.chromeAppsStrings.indicate = this.cast("indicate")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def reliableWrite: typings.chromeApps.chromeAppsStrings.reliableWrite = this.cast("reliableWrite")
  @scala.inline
  def writableAuxiliaries: typings.chromeApps.chromeAppsStrings.writableAuxiliaries = this.cast("writableAuxiliaries")
  @scala.inline
  def write: write_ = this.cast("write")
  @scala.inline
  def writeWithoutResponse: typings.chromeApps.chromeAppsStrings.writeWithoutResponse = this.cast("writeWithoutResponse")
}

