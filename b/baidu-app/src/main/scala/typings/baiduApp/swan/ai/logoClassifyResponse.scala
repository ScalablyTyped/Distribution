package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Probability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait logoClassifyResponse extends StObject {
  
  var log_id: Double = js.native
  
  // 识别结果数，标识返回结果数目。
  var result: js.Array[Probability] = js.native
  
  //     唯一的log id，用于问题定位。
  var result_num: Double = js.native
}
object logoClassifyResponse {
  
  @scala.inline
  def apply(log_id: Double, result: js.Array[Probability], result_num: Double): logoClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[logoClassifyResponse]
  }
  
  @scala.inline
  implicit class logoClassifyResponseMutableBuilder[Self <: logoClassifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Array[Probability]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Probability*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setResult_num(value: Double): Self = StObject.set(x, "result_num", value.asInstanceOf[js.Any])
  }
}
