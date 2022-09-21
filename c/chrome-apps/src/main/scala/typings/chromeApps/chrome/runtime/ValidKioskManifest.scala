package typings.chromeApps.chrome.runtime

import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Alwaysupdate
import typings.chromeApps.anon.Background
import typings.chromeApps.chromeAppsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest for Chrome OS Kiosk apps
  * @requires(CrOS Kiosk App) **Only for Chrome OS Kiosk Apps.**
  */
trait ValidKioskManifest
  extends StObject
     with PartialManifest
     with Manifest {
  
  /** Kiosk settings */
  var kiosk: js.UndefOr[Alwaysupdate] = js.undefined
  
  /**
    * Enable this app to be used as a kiosk app.
    */
  var kiosk_enabled: `true`
  
  /**
    * This app can only be used as a kiosk app on Chrome OS
    */
  var kiosk_only: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Not useful since it will prevent app from running.
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L155}
    */
  var kiosk_secondary_apps: js.UndefOr[Any] = js.undefined
}
object ValidKioskManifest {
  
  inline def apply(app: Background, externally_connectable: Accepttlschannelid, name: String, version: String): ValidKioskManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], kiosk_enabled = true, manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidKioskManifest]
  }
  
  extension [Self <: ValidKioskManifest](x: Self) {
    
    inline def setKiosk(value: Alwaysupdate): Self = StObject.set(x, "kiosk", value.asInstanceOf[js.Any])
    
    inline def setKioskUndefined: Self = StObject.set(x, "kiosk", js.undefined)
    
    inline def setKiosk_enabled(value: `true`): Self = StObject.set(x, "kiosk_enabled", value.asInstanceOf[js.Any])
    
    inline def setKiosk_only(value: Boolean): Self = StObject.set(x, "kiosk_only", value.asInstanceOf[js.Any])
    
    inline def setKiosk_onlyUndefined: Self = StObject.set(x, "kiosk_only", js.undefined)
    
    inline def setKiosk_secondary_apps(value: Any): Self = StObject.set(x, "kiosk_secondary_apps", value.asInstanceOf[js.Any])
    
    inline def setKiosk_secondary_appsUndefined: Self = StObject.set(x, "kiosk_secondary_apps", js.undefined)
  }
}
