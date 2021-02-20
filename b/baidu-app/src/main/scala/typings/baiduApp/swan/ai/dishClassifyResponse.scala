package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Calorie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dishClassifyResponse extends StObject {
  
  var log_id: Double = js.native
  
  // 返回结果数目，及result数组中的元素个数。
  var result: js.Array[Calorie] = js.native
  
  //     唯一的log id，用于问题定位。
  var result_num: Double = js.native
}
object dishClassifyResponse {
  
  @scala.inline
  def apply(log_id: Double, result: js.Array[Calorie], result_num: Double): dishClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[dishClassifyResponse]
  }
  
  @scala.inline
  implicit class dishClassifyResponseMutableBuilder[Self <: dishClassifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Array[Calorie]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Calorie*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setResult_num(value: Double): Self = StObject.set(x, "result_num", value.asInstanceOf[js.Any])
  }
}
