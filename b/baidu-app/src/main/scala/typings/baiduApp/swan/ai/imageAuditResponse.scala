package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait imageAuditResponse extends js.Object {
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
  implicit class imageAuditResponseOps[Self <: imageAuditResponse] (val x: Self) extends AnyVal {
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
    def setConclusion(value: String): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setConclusionType(value: Double): Self = this.set("conclusionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: imageAuditdata*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[imageAuditdata]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog_id(value: String): Self = this.set("log_id", value.asInstanceOf[js.Any])
  }
  
}

