package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Background
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chrome.runtime.ValidKioskManifest
  - typings.chromeApps.chrome.runtime.ValidNonKioskManifest
  - typings.chromeApps.chrome.runtime.InvalidManifest
*/
trait Manifest extends js.Object

object Manifest {
  @scala.inline
  def ValidKioskManifest(
    app: Background,
    externally_connectable: Accepttlschannelid,
    kiosk_enabled: `true`,
    manifest_version: `2`,
    name: String,
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = kiosk_enabled.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  def ValidNonKioskManifest(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  def InvalidManifest(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): Manifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

