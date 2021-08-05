package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectIdentifyResponse extends StObject {
  
  var log_id: Double
  
  //     唯一的log id，用于问题定位。
  var result: Height
}
object DetectIdentifyResponse {
  
  inline def apply(log_id: Double, result: Height): DetectIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyResponse]
  }
  
  extension [Self <: DetectIdentifyResponse](x: Self) {
    
    inline def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Height): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
