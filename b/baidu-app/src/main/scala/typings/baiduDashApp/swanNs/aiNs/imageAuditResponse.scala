package typings.baiduDashApp.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageAuditResponse extends js.Object {
   // 请求唯一id
  var conclusion: String
   // 审核结果描述，成功才返回，失败不返回。
  var conclusionType: Double
   // 审核结果标识，成功才返回，失败不返回。
  var data: js.Array[imageAuditdata]
  var log_id: String
}

object imageAuditResponse {
  @scala.inline
  def apply(conclusion: String, conclusionType: Double, data: js.Array[imageAuditdata], log_id: String): imageAuditResponse = {
    val __obj = js.Dynamic.literal(conclusion = conclusion, conclusionType = conclusionType, data = data, log_id = log_id)
  
    __obj.asInstanceOf[imageAuditResponse]
  }
}

