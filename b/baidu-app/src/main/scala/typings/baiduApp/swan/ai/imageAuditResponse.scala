package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait imageAuditResponse extends StObject {
  
  // 请求唯一id
  var conclusion: String = js.native
  
  // 审核结果描述，成功才返回，失败不返回。
  var conclusionType: Double = js.native
  
  // 审核结果标识，成功才返回，失败不返回。
  var data: js.Array[imageAuditdata] = js.native
  
  var log_id: String = js.native
}
object imageAuditResponse {
  
  @scala.inline
  def apply(conclusion: String, conclusionType: Double, data: js.Array[imageAuditdata], log_id: String): imageAuditResponse = {
    val __obj = js.Dynamic.literal(conclusion = conclusion.asInstanceOf[js.Any], conclusionType = conclusionType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditResponse]
  }
  
  @scala.inline
  implicit class imageAuditResponseMutableBuilder[Self <: imageAuditResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusionType(value: Double): Self = StObject.set(x, "conclusionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[imageAuditdata]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: imageAuditdata*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
  }
}
