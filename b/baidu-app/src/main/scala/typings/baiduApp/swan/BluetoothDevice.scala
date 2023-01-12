package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备信息
  */
trait BluetoothDevice extends StObject {
  
  /**
    * int 当前蓝牙设备的信号强度
    */
  var RSSI: Double
  
  /**
    * 当前蓝牙设备的广播内容
    */
  var advertisData: js.typedarray.ArrayBuffer
  
  /**
    * 用于区分设备的 id
    */
  var deviceId: String
  
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: String
}
object BluetoothDevice {
  
  inline def apply(RSSI: Double, advertisData: js.typedarray.ArrayBuffer, deviceId: String, name: String): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothDevice] (val x: Self) extends AnyVal {
    
    inline def setAdvertisData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
  }
}
