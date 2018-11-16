package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Manifest for Chrome OS Kiosk apps
         * @requires(CrOS Kiosk App) **Only for Chrome OS Kiosk Apps.**
         */

trait ValidKioskManifest extends PartialManifest {
  /** Kiosk settings */
  var kiosk: js.UndefOr[chromeDashAppsLib.Anon_Requiredplatformversion] = js.undefined
  /**
               * Enable this app to be used as a kiosk app.
               */
  var kiosk_enabled: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`
  /**
               * This app can only be used as a kiosk app on Chrome OS
               */
  var kiosk_only: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Not useful since it will prevent app from running.
               * @see[Source]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L155}
               */
  var kiosk_secondary_apps: js.UndefOr[js.Any] = js.undefined
}

