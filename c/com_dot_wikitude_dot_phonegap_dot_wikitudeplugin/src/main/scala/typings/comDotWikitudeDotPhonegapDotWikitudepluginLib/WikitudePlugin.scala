package typings
package comDotWikitudeDotPhonegapDotWikitudepluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WikitudePlugin extends js.Object {
  var CameraFocusRangeFar: scala.Double = js.native
  var CameraFocusRangeNear: scala.Double = js.native
  var CameraFocusRangeNone: scala.Double = js.native
  var CameraPositionBack: scala.Double = js.native
  var CameraPositionFront: scala.Double = js.native
  var CameraPositionUndefined: scala.Double = js.native
  var Feature2DTracking: java.lang.String = js.native
  var FeatureGeo: java.lang.String = js.native
  var _sdkKey: java.lang.String = js.native
  // test type ok?
  def callJavaScript(js_ : js.Any): scala.Unit = js.native
  def captureScreen(
    successCallback: js.Function1[/* success */ java.lang.String, scala.Unit],
    errorCallback: js.Function1[/* message */ java.lang.String, scala.Unit],
    includeWebView: scala.Boolean
  ): scala.Unit = js.native
  def captureScreen(
    successCallback: js.Function1[/* success */ java.lang.String, scala.Unit],
    errorCallback: js.Function1[/* message */ java.lang.String, scala.Unit],
    includeWebView: scala.Boolean,
    imagePathInBundleOrNullForPhotoLibrary: java.lang.String
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def isDeviceSupported(
    successCallback: js.Function1[/* success */ java.lang.String, scala.Unit],
    errorCallback: js.Function1[/* message */ java.lang.String, scala.Unit],
    requiredFeatures: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def loadARchitectWorld(
    successCallback: js.Function1[/* success */ java.lang.String, scala.Unit],
    errorCallback: js.Function1[/* message */ java.lang.String, scala.Unit],
    architectWorldPath: java.lang.String,
    requiredFeatures: js.Array[java.lang.String],
    startupConfiguration: js.Object
  ): scala.Unit = js.native
  def loadARchitectWorld(
    successCallback: js.Function1[/* success */ java.lang.String, scala.Unit],
    errorCallback: js.Function1[/* message */ java.lang.String, scala.Unit],
    architectWorldPath: java.lang.String,
    requiredFeatures: js.Array[java.lang.String],
    startupConfiguration: stdLib.JSON
  ): scala.Unit = js.native
  def onBackButton(): scala.Unit = js.native
  def onPause(): scala.Unit = js.native
  /* Lifecycle updates */
  def onResume(): scala.Unit = js.native
  def onWikitudeError(): scala.Unit = js.native
  def onWikitudeOK(): scala.Unit = js.native
  def setBackButtonCallback(onBackButtonCallback: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setDeviceSensorsFinishedCalibrationHandler(finishedCalibrationHandler: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setDeviceSensorsNeedCalibrationHandler(startCalibrationHandler: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setErrorHandler(errorHandler: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setLocation(latitude: js.Any, longitude: js.Any, altitude: js.Any, accuracy: js.Any): scala.Unit = js.native
  def setOnUrlInvokeCallback(onUrlInvokeCallback: js.Function1[/* success */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

