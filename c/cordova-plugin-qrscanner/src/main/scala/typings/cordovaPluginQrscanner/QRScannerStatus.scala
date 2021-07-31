package typings.cordovaPluginQrscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* An object representing the current status of QRScanner.
*/
trait QRScannerStatus extends StObject {
  
  /**
    * On iOS and Android 6.0+, camera access is granted at runtime by the user (by
    * clicking "Allow" at the dialog). The `authorized` property is a boolean
    * value which is true only when the user has allowed camera access to your app
    * (`AVAuthorizationStatus.Authorized`). On platforms with permissions granted
    * at install (Android pre-6.0, Windows Phone) this property is always true.
    */
  var authorized: Boolean
  
  /**
    * A boolean value which is true only if the users' device can enable a light
    * in the direction of the currentCamera.
    */
  var canEnableLight: Boolean
  
  /**
    * A boolean value which is true only if the users' operating system is able
    * to `QRScanner.openSettings()`.
    */
  var canOpenSettings: Boolean
  
  /**
    * A number representing the index of the currentCamera. `0` is the back
    * camera, `1` is the front.
    */
  var currentCamera: Double
  
  /**
    * A boolean value which is true if the user permenantly denied camera access
    * to the app (`AVAuthorizationStatus.Denied`). Once denied, camera access can
    * only be gained by requesting the user change their decision (consider
    * offering a link to the setting via `openSettings()`).
    */
  var denied: Boolean
  
  /**
    * A boolean value which is true if the light is enabled.
    */
  var lightEnabled: Boolean
  
  /**
    * A boolean value which is true if QRScanner is prepared to capture video and
    * render it to the view.
    */
  var prepared: Boolean
  
  /**
    * A boolean value which is true if QRScanner is displaying a live preview
    * from the device's camera. Set to false when the preview is paused.
    */
  var previewing: Boolean
  
  /**
    * A boolean value which is true if the user is unable to grant permissions due
    * to parental controls, organization security configuration profiles, or
    * similar reasons.
    */
  var restricted: Boolean
  
  /**
    * A boolean value which is true if QRScanner is actively scanning for a QR code.
    */
  var scanning: Boolean
  
  /**
    * A boolean value which is true when the native webview background is transparent.
    */
  var webviewBackgroundIsTransparent: Boolean
}
object QRScannerStatus {
  
  @scala.inline
  def apply(
    authorized: Boolean,
    canEnableLight: Boolean,
    canOpenSettings: Boolean,
    currentCamera: Double,
    denied: Boolean,
    lightEnabled: Boolean,
    prepared: Boolean,
    previewing: Boolean,
    restricted: Boolean,
    scanning: Boolean,
    webviewBackgroundIsTransparent: Boolean
  ): QRScannerStatus = {
    val __obj = js.Dynamic.literal(authorized = authorized.asInstanceOf[js.Any], canEnableLight = canEnableLight.asInstanceOf[js.Any], canOpenSettings = canOpenSettings.asInstanceOf[js.Any], currentCamera = currentCamera.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], lightEnabled = lightEnabled.asInstanceOf[js.Any], prepared = prepared.asInstanceOf[js.Any], previewing = previewing.asInstanceOf[js.Any], restricted = restricted.asInstanceOf[js.Any], scanning = scanning.asInstanceOf[js.Any], webviewBackgroundIsTransparent = webviewBackgroundIsTransparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRScannerStatus]
  }
  
  @scala.inline
  implicit class QRScannerStatusMutableBuilder[Self <: QRScannerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEnableLight(value: Boolean): Self = StObject.set(x, "canEnableLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanOpenSettings(value: Boolean): Self = StObject.set(x, "canOpenSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCamera(value: Double): Self = StObject.set(x, "currentCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenied(value: Boolean): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightEnabled(value: Boolean): Self = StObject.set(x, "lightEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepared(value: Boolean): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewing(value: Boolean): Self = StObject.set(x, "previewing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanning(value: Boolean): Self = StObject.set(x, "scanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebviewBackgroundIsTransparent(value: Boolean): Self = StObject.set(x, "webviewBackgroundIsTransparent", value.asInstanceOf[js.Any])
  }
}
