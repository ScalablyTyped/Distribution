package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDevicesEventMap extends StObject {
  
  var devicechange: Event
}
object MediaDevicesEventMap {
  
  inline def apply(devicechange: Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  extension [Self <: MediaDevicesEventMap](x: Self) {
    
    inline def setDevicechange(value: Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
