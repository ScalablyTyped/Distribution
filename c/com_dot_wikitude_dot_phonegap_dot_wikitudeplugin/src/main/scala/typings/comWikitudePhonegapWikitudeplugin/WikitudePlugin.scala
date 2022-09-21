package typings.comWikitudePhonegapWikitudeplugin

import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WikitudePlugin extends StObject {
  
  var CameraFocusRangeFar: Double = js.native
  
  var CameraFocusRangeNear: Double = js.native
  
  var CameraFocusRangeNone: Double = js.native
  
  var CameraPositionBack: Double = js.native
  
  var CameraPositionFront: Double = js.native
  
  var CameraPositionUndefined: Double = js.native
  
  var Feature2DTracking: String = js.native
  
  var FeatureGeo: String = js.native
  
  var _sdkKey: String = js.native
  
  // test type ok?
  def callJavaScript(js_ : Any): Unit = js.native
  
  def captureScreen(
    successCallback: js.Function1[/* success */ String, Unit],
    errorCallback: js.Function1[/* message */ String, Unit],
    includeWebView: Boolean
  ): Unit = js.native
  def captureScreen(
    successCallback: js.Function1[/* success */ String, Unit],
    errorCallback: js.Function1[/* message */ String, Unit],
    includeWebView: Boolean,
    imagePathInBundleOrNullForPhotoLibrary: String
  ): Unit = js.native
  
  def close(): Unit = js.native
  
  def hide(): Unit = js.native
  
  def isDeviceSupported(
    successCallback: js.Function1[/* success */ String, Unit],
    errorCallback: js.Function1[/* message */ String, Unit],
    requiredFeatures: js.Array[String]
  ): Unit = js.native
  
  def loadARchitectWorld(
    successCallback: js.Function1[/* success */ String, Unit],
    errorCallback: js.Function1[/* message */ String, Unit],
    architectWorldPath: String,
    requiredFeatures: js.Array[String],
    startupConfiguration: js.Object
  ): Unit = js.native
  def loadARchitectWorld(
    successCallback: js.Function1[/* success */ String, Unit],
    errorCallback: js.Function1[/* message */ String, Unit],
    architectWorldPath: String,
    requiredFeatures: js.Array[String],
    startupConfiguration: JSON
  ): Unit = js.native
  
  def onBackButton(): Unit = js.native
  
  def onPause(): Unit = js.native
  
  /* Lifecycle updates */
  def onResume(): Unit = js.native
  
  def onWikitudeError(): Unit = js.native
  
  def onWikitudeOK(): Unit = js.native
  
  def setBackButtonCallback(onBackButtonCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  def setDeviceSensorsFinishedCalibrationHandler(finishedCalibrationHandler: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  def setDeviceSensorsNeedCalibrationHandler(startCalibrationHandler: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  def setErrorHandler(errorHandler: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  def setLocation(latitude: Any, longitude: Any, altitude: Any, accuracy: Any): Unit = js.native
  
  def setOnUrlInvokeCallback(onUrlInvokeCallback: js.Function1[/* success */ String, Unit]): Unit = js.native
  
  def show(): Unit = js.native
}
