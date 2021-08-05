package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothAdapterState extends StObject {
  
  /**
    * 蓝牙适配器是否可用
    */
  var available: Boolean
  
  /**
    * 蓝牙适配器是否处于搜索状态
    */
  var discovering: Boolean
}
object BluetoothAdapterState {
  
  inline def apply(available: Boolean, discovering: Boolean): BluetoothAdapterState = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterState]
  }
  
  extension [Self <: BluetoothAdapterState](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setDiscovering(value: Boolean): Self = StObject.set(x, "discovering", value.asInstanceOf[js.Any])
  }
}
