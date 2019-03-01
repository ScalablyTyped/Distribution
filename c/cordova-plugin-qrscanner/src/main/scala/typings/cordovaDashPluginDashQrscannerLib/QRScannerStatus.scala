package typings
package cordovaDashPluginDashQrscannerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* An object representing the current status of QRScanner.
*/
trait QRScannerStatus extends js.Object {
  /**
    * On iOS and Android 6.0+, camera access is granted at runtime by the user (by
    * clicking "Allow" at the dialog). The `authorized` property is a boolean
    * value which is true only when the user has allowed camera access to your app
    * (`AVAuthorizationStatus.Authorized`). On platforms with permissions granted
    * at install (Android pre-6.0, Windows Phone) this property is always true.
    */
  var authorized: scala.Boolean
  /**
    * A boolean value which is true only if the users' device can enable a light
    * in the direction of the currentCamera.
    */
  var canEnableLight: scala.Boolean
  /**
    * A boolean value which is true only if the users' operating system is able
    * to `QRScanner.openSettings()`.
    */
  var canOpenSettings: scala.Boolean
  /**
    * A number representing the index of the currentCamera. `0` is the back
    * camera, `1` is the front.
    */
  var currentCamera: scala.Double
  /**
    * A boolean value which is true if the user permenantly denied camera access
    * to the app (`AVAuthorizationStatus.Denied`). Once denied, camera access can
    * only be gained by requesting the user change their decision (consider
    * offering a link to the setting via `openSettings()`).
    */
  var denied: scala.Boolean
  /**
    * A boolean value which is true if the light is enabled.
    */
  var lightEnabled: scala.Boolean
  /**
    * A boolean value which is true if QRScanner is prepared to capture video and
    * render it to the view.
    */
  var prepared: scala.Boolean
  /**
    * A boolean value which is true if QRScanner is displaying a live preview
    * from the device's camera. Set to false when the preview is paused.
    */
  var previewing: scala.Boolean
  /**
    * A boolean value which is true if the user is unable to grant permissions due
    * to parental controls, organization security configuration profiles, or
    * similar reasons.
    */
  var restricted: scala.Boolean
  /**
    * A boolean value which is true if QRScanner is actively scanning for a QR code.
    */
  var scanning: scala.Boolean
  /**
    * A boolean value which is true when the native webview background is transparent.
    */
  var webviewBackgroundIsTransparent: scala.Boolean
}

object QRScannerStatus {
  @scala.inline
  def apply(
    authorized: scala.Boolean,
    canEnableLight: scala.Boolean,
    canOpenSettings: scala.Boolean,
    currentCamera: scala.Double,
    denied: scala.Boolean,
    lightEnabled: scala.Boolean,
    prepared: scala.Boolean,
    previewing: scala.Boolean,
    restricted: scala.Boolean,
    scanning: scala.Boolean,
    webviewBackgroundIsTransparent: scala.Boolean
  ): QRScannerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorized")(authorized)
    __obj.updateDynamic("canEnableLight")(canEnableLight)
    __obj.updateDynamic("canOpenSettings")(canOpenSettings)
    __obj.updateDynamic("currentCamera")(currentCamera)
    __obj.updateDynamic("denied")(denied)
    __obj.updateDynamic("lightEnabled")(lightEnabled)
    __obj.updateDynamic("prepared")(prepared)
    __obj.updateDynamic("previewing")(previewing)
    __obj.updateDynamic("restricted")(restricted)
    __obj.updateDynamic("scanning")(scanning)
    __obj.updateDynamic("webviewBackgroundIsTransparent")(webviewBackgroundIsTransparent)
    __obj.asInstanceOf[QRScannerStatus]
  }
}

