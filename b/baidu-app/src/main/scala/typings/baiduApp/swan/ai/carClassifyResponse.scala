package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Height
import typings.baiduApp.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait carClassifyResponse extends js.Object {
  var location_result: Height = js.native
  var log_id: Double = js.native
   //     唯一的log id，用于问题定位。
  var result: js.Array[Name] = js.native
}

object carClassifyResponse {
  @scala.inline
  def apply(location_result: Height, log_id: Double, result: js.Array[Name]): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyResponse]
  }
  @scala.inline
  implicit class carClassifyResponseOps[Self <: carClassifyResponse] (val x: Self) extends AnyVal {
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
    def setLocation_result(value: Height): Self = this.set("location_result", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog_id(value: Double): Self = this.set("log_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultVarargs(value: Name*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[Name]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

