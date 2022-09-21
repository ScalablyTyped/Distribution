package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeviceAttributes extends StObject {
  
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit
  
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit
  
  def getDeviceHostname(callback: js.Function1[/* hostname */ String, Unit]): Unit
  
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit
  
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit
}
object TypeofdeviceAttributes {
  
  inline def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Unit,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Unit,
    getDeviceHostname: js.Function1[/* hostname */ String, Unit] => Unit,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Unit,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Unit
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1(getDeviceAnnotatedLocation), getDeviceAssetId = js.Any.fromFunction1(getDeviceAssetId), getDeviceHostname = js.Any.fromFunction1(getDeviceHostname), getDeviceSerialNumber = js.Any.fromFunction1(getDeviceSerialNumber), getDirectoryDeviceId = js.Any.fromFunction1(getDirectoryDeviceId))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
  
  extension [Self <: TypeofdeviceAttributes](x: Self) {
    
    inline def setGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceAnnotatedLocation", js.Any.fromFunction1(value))
    
    inline def setGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceAssetId", js.Any.fromFunction1(value))
    
    inline def setGetDeviceHostname(value: js.Function1[/* hostname */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceHostname", js.Any.fromFunction1(value))
    
    inline def setGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceSerialNumber", js.Any.fromFunction1(value))
    
    inline def setGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Unit): Self = StObject.set(x, "getDirectoryDeviceId", js.Any.fromFunction1(value))
  }
}
