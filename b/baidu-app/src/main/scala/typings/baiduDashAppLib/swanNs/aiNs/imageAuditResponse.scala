package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageAuditResponse extends js.Object {
   // 请求唯一id
  var conclusion: java.lang.String
   // 审核结果描述，成功才返回，失败不返回。
  var conclusionType: scala.Double
   // 审核结果标识，成功才返回，失败不返回。
  var data: js.Array[imageAuditdata]
  var log_id: java.lang.String
}

object imageAuditResponse {
  @scala.inline
  def apply(
    conclusion: java.lang.String,
    conclusionType: scala.Double,
    data: js.Array[imageAuditdata],
    log_id: java.lang.String
  ): imageAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conclusion")(conclusion)
    __obj.updateDynamic("conclusionType")(conclusionType)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("log_id")(log_id)
    __obj.asInstanceOf[imageAuditResponse]
  }
}

