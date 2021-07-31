package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Keyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralIdentifyResponse extends StObject {
  
  var log_id: Double
  
  // 返回结果数目，及result数组中的元素个数。
  var result: js.Array[Keyword]
  
  //     唯一的log id，用于问题定位。
  var result_num: Double
}
object GeneralIdentifyResponse {
  
  @scala.inline
  def apply(log_id: Double, result: js.Array[Keyword], result_num: Double): GeneralIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralIdentifyResponse]
  }
  
  @scala.inline
  implicit class GeneralIdentifyResponseMutableBuilder[Self <: GeneralIdentifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Array[Keyword]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Keyword*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setResult_num(value: Double): Self = StObject.set(x, "result_num", value.asInstanceOf[js.Any])
  }
}
