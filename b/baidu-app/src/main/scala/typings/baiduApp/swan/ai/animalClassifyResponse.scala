package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait animalClassifyResponse extends StObject {
  
  var log_id: Double
  
  // 识别结果数，标识返回结果数目。
  var result: js.Array[Score]
  
  //     唯一的log id，用于问题定位。
  var result_num: Double
}
object animalClassifyResponse {
  
  inline def apply(log_id: Double, result: js.Array[Score], result_num: Double): animalClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[animalClassifyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: animalClassifyResponse] (val x: Self) extends AnyVal {
    
    inline def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[Score]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Score*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setResult_num(value: Double): Self = StObject.set(x, "result_num", value.asInstanceOf[js.Any])
  }
}
