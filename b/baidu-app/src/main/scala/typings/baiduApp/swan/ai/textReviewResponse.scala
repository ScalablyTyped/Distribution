package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait textReviewResponse extends StObject {
  
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
  implicit class textReviewResponseMutableBuilder[Self <: textReviewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Pass): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
