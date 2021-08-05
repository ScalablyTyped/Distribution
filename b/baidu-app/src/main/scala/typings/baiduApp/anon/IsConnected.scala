package typings.baiduApp.anon

import typings.baiduApp.swan.networkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsConnected extends StObject {
  
  var isConnected: Boolean
  
  var networkType: typings.baiduApp.swan.networkType
}
object IsConnected {
  
  inline def apply(isConnected: Boolean, networkType: networkType): IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnected]
  }
  
  extension [Self <: IsConnected](x: Self) {
    
    inline def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    inline def setNetworkType(value: networkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
