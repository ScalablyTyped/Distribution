package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCStats extends StObject {
  
  var id: java.lang.String
  
  var timestamp: DOMHighResTimeStamp
  
  var `type`: RTCStatsType
}
object RTCStats {
  
  inline def apply(id: java.lang.String, timestamp: DOMHighResTimeStamp, `type`: RTCStatsType): RTCStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStats]
  }
  
  extension [Self <: RTCStats](x: Self) {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: RTCStatsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
