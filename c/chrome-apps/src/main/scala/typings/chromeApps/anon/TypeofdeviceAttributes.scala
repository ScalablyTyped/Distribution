package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeviceAttributes extends StObject {
  
  /**
    * @since Chrome 66.
    * @description
    * Fetches the administrator-annotated Location.
    * If the current user is not affiliated or no Annotated Location has been set by the administrator, returns an empty string.
    * @param callback Called with the Annotated Location of the device.
    */
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit
  
  /**
    * @since Chrome 66.
    * @description
    * Fetches the administrator-annotated Asset Id.
    * If the current user is not affiliated or no Asset Id has been set by the administrator, returns an empty string.
    * @param callback Called with the Asset ID of the device.
    */
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit
  
  /**
    * @since Chrome 66.
    * @description
    * Fetches the device's serial number.
    * Please note the purpose of this API is to administrate the device
    * (e.g. generating Certificate Sign Requests for device-wide certificates).
    * This API may not be used for tracking devices without the consent of the device's administrator.
    * If the current user is not affiliated, returns an empty string.
    * @param callback Called with the serial number of the device.
    */
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit
  
  /**
    * @description
    * Fetches the value of the device identifier of the directory API,
    * that is generated by the server and identifies the cloud record
    * of the device for querying in the cloud directory API.
    * If the current user is not affiliated, returns an empty string.
    * @param callback Called with the device identifier of the directory API when received.
    */
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit
}
object TypeofdeviceAttributes {
  
  inline def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Unit,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Unit,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Unit,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Unit
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1(getDeviceAnnotatedLocation), getDeviceAssetId = js.Any.fromFunction1(getDeviceAssetId), getDeviceSerialNumber = js.Any.fromFunction1(getDeviceSerialNumber), getDirectoryDeviceId = js.Any.fromFunction1(getDirectoryDeviceId))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdeviceAttributes] (val x: Self) extends AnyVal {
    
    inline def setGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceAnnotatedLocation", js.Any.fromFunction1(value))
    
    inline def setGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceAssetId", js.Any.fromFunction1(value))
    
    inline def setGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceSerialNumber", js.Any.fromFunction1(value))
    
    inline def setGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Unit): Self = StObject.set(x, "getDirectoryDeviceId", js.Any.fromFunction1(value))
  }
}
