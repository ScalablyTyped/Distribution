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

