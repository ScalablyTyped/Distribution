package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectIdentifyResponse extends js.Object {
  var log_id: Double = js.native
   //     唯一的log id，用于问题定位。
  var result: Height = js.native
}

object DetectIdentifyResponse {
  @scala.inline
  def apply(log_id: Double, result: Height): DetectIdentifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectIdentifyResponse]
  }
  @scala.inline
  implicit class DetectIdentifyResponseOps[Self <: DetectIdentifyResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: Height): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

