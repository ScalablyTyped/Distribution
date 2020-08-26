package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Background
import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidNonKioskManifest
  extends PartialManifest
     with Manifest {
  var kiosk_enabled: js.UndefOr[`false`] = js.native
}

object ValidNonKioskManifest {
  @scala.inline
  def apply(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): ValidNonKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidNonKioskManifest]
  }
  @scala.inline
  implicit class ValidNonKioskManifestOps[Self <: ValidNonKioskManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKiosk_enabled(value: `false`): Self = this.set("kiosk_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKiosk_enabled: Self = this.set("kiosk_enabled", js.undefined)
  }
  
}

