package typings.cordovaPluginQrscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* The QRScanner object provides functions to initialize, control, utilize, and
* deallocate a native QR code scanner and video preview behind the Cordova webview.
*/
@js.native
trait QRScanner extends js.Object {
  
  /**
    * Cancels the current scan. If `QRScanner.prepare()` has not been called,
    * this method performs that setup as well.
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def cancelScan(): Unit = js.native
  def cancelScan(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Runs hide(), stops scanning, video capture, and the preview, and
    * deallocates as much as possible. (E.g. to improve performance/battery life
    * when the scanner is not likely to be used for a while.)
    * Basically reverts the plugin to it's startup-state.
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def destroy(): Unit = js.native
  def destroy(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Disable the device's light. If `QRScanner.prepare()` has not been called,
    * this method performs that setup as well.
    * @param {function} [callback] Callback that gets an error or the QRScannerStatus object.
    */
  def disableLight(): Unit = js.native
  def disableLight(callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Enable the device's light (for scanning in low-light environments). If
    * `QRScanner.prepare()` has not been called, this method performs that setup
    * as well.
    * @param {function} [callback] Callback that gets an error or the QRScannerStatus object.
    */
  def enableLight(): Unit = js.native
  def enableLight(callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Retrieve the status of QRScanner and provide it to the callback function.
    * @param {function} callback Callback that gets the QRScannerStatus object.
    */
  def getStatus(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Configures the native webview to be opaque with a white background,
    * covering the video preview.
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def hide(): Unit = js.native
  def hide(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Open the app-specific permission settings in the user's device settings.
    * Here the user can enable/disable camera (and other) access for your app.
    *
    * Note: iOS immediately kills all apps affected by permissions changes. If
    * the user changes a permission settings, your app will stop and only
    * restart when they return.
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def openSettings(): Unit = js.native
  def openSettings(callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Pauses the video preview on the current frame (as if a snapshot was taken).
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def pausePreview(): Unit = js.native
  def pausePreview(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Request permission to access the camera (if not already granted), prepare
    * the video preview, and configure everything needed by QRScanner. This will
    * only be visible if `QRScanner.show()` has already made the webview transparent.
    * @param {function} [callback] Callback that gets an error or the QRScannerStatus object.
    */
  def prepare(): Unit = js.native
  def prepare(callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Resumes the video preview.
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def resumePreview(): Unit = js.native
  def resumePreview(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Sets QRScanner to "watch" for valid QR codes. Once a valid code is
    * detected, it's contents are passed to the callback, and scanning is
    * toggled off. If `QRScanner.prepare()` has not been called,
    * this method performs that setup as well. The video preview does
    * not need to be visible for scanning to function.
    * @param {function} callback Callback that gets an error or the results string.
    */
  def scan(callback: js.Function2[/* error */ QRScannerError, /* result */ String, _]): Unit = js.native
  
  /**
    * Configures the native webview to have a transparent background, then sets
    * the background of the `<body>` and parent elements to transparent,
    * allowing the webview to re-render with the transparent background.
    *
    * To see the video preview, your application background must be transparent
    * in the areas through which it should show.
    * @param {function} [callback] Callback that gets the QRScannerStatus object.
    */
  def show(): Unit = js.native
  def show(callback: js.Function1[/* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Switch video capture to the device's back camera. If `QRScanner.prepare()`
    * has not been called, this method performs that setup as well.
    * @param {function} [callback] Callback that gets an error or the QRScannerStatus object.
    */
  def useBackCamera(): Unit = js.native
  def useBackCamera(callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Switch video capture to the `index` camera. Camera `0` is the back camera,
    * camera `1` is front camera. If `QRScanner.prepare()` has not been called,
    * this method performs that setup as well.
    * @param {number} index A number representing the index of the camera to use.
    * @param {function} [callback] Callback that gets an error or the QRScannerStatus object.
    */
  def useCamera(index: Double): Unit = js.native
  def useCamera(index: Double, callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
  
  /**
    * Switch video capture to the device's front camera. If `QRScanner.prepare()`
    * has not been called, this method performs that setup as well.
    * @param {function} [callback] Callback that gets an error or the QRScannerStatus object.
    */
  def useFrontCamera(): Unit = js.native
  def useFrontCamera(callback: js.Function2[/* error */ QRScannerError, /* status */ QRScannerStatus, _]): Unit = js.native
}
