package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Keyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralIdentifyResponse extends js.Object {
  
  var log_id: Double = js.native
  
   // 返回结果数目，及result数组中的元素个数。
  var result: js.Array[Keyword] = js.native
  
   //     唯一的log id，用于问题定位。
  var result_num: Double = js.native
}
object GeneralIdentifyResponse {
  
  @scala.inline
  def apply(log_id: Double, result: js.Array[Keyword], result_num: Double): GeneralIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralIdentifyResponse]
  }
  
  @scala.inline
  implicit class GeneralIdentifyResponseOps[Self <: GeneralIdentifyResponse] (val x: Self) extends AnyVal {
    
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
    def setResultVarargs(value: Keyword*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Keyword]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_num(value: Double): Self = this.set("result_num", value.asInstanceOf[js.Any])
  }
}
