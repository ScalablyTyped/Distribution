package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Pass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait textReviewResponse extends js.Object {
  
  var log_id: String = js.native
  
   // 唯一的log id，用于问题定位。
  var result: Pass = js.native
}
object textReviewResponse {
  
  @scala.inline
  def apply(log_id: String, result: Pass): textReviewResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[textReviewResponse]
  }
  
  @scala.inline
  implicit class textReviewResponseOps[Self <: textReviewResponse] (val x: Self) extends AnyVal {
    
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
    def setLog_id(value: String): Self = this.set("log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Pass): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
