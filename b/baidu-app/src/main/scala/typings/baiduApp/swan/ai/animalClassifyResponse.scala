package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Score
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait animalClassifyResponse extends js.Object {
  
  var log_id: Double = js.native
  
   // 识别结果数，标识返回结果数目。
  var result: js.Array[Score] = js.native
  
   //     唯一的log id，用于问题定位。
  var result_num: Double = js.native
}
object animalClassifyResponse {
  
  @scala.inline
  def apply(log_id: Double, result: js.Array[Score], result_num: Double): animalClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[animalClassifyResponse]
  }
  
  @scala.inline
  implicit class animalClassifyResponseOps[Self <: animalClassifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLog_id(value: Double): Self = this.set("log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Score*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Score]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_num(value: Double): Self = this.set("result_num", value.asInstanceOf[js.Any])
  }
}
