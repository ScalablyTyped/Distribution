package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceRecognizeResponse extends js.Object {
  var result: String = js.native
}

object VoiceRecognizeResponse {
  @scala.inline
  def apply(result: String): VoiceRecognizeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceRecognizeResponse]
  }
  @scala.inline
  implicit class VoiceRecognizeResponseOps[Self <: VoiceRecognizeResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

