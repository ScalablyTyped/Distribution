package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Alwaysupdate
import typings.chromeApps.anon.Background
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest for Chrome OS Kiosk apps
  * @requires(CrOS Kiosk App) **Only for Chrome OS Kiosk Apps.**
  */
@js.native
trait ValidKioskManifest
  extends PartialManifest
     with Manifest {
  
  /** Kiosk settings */
  var kiosk: js.UndefOr[Alwaysupdate] = js.native
  
  /**
    * Enable this app to be used as a kiosk app.
    */
  var kiosk_enabled: `true` = js.native
  
  /**
    * This app can only be used as a kiosk app on Chrome OS
    */
  var kiosk_only: js.UndefOr[Boolean] = js.native
  
  /**
    * Not useful since it will prevent app from running.
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L155}
    */
  var kiosk_secondary_apps: js.UndefOr[js.Any] = js.native
}
object ValidKioskManifest {
  
  @scala.inline
  def apply(
    app: Background,
    externally_connectable: Accepttlschannelid,
    kiosk_enabled: `true`,
    manifest_version: `2`,
    name: String,
    version: String
  ): ValidKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = kiosk_enabled.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidKioskManifest]
  }
  
  @scala.inline
  implicit class ValidKioskManifestOps[Self <: ValidKioskManifest] (val x: Self) extends AnyVal {
    
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
    def setKiosk_enabled(value: `true`): Self = this.set("kiosk_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKiosk(value: Alwaysupdate): Self = this.set("kiosk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKiosk: Self = this.set("kiosk", js.undefined)
    
    @scala.inline
    def setKiosk_only(value: Boolean): Self = this.set("kiosk_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKiosk_only: Self = this.set("kiosk_only", js.undefined)
    
    @scala.inline
    def setKiosk_secondary_apps(value: js.Any): Self = this.set("kiosk_secondary_apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKiosk_secondary_apps: Self = this.set("kiosk_secondary_apps", js.undefined)
  }
}
