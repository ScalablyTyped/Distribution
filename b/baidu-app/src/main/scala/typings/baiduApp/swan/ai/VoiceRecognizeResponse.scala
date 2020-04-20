package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceRecognizeResponse extends js.Object {
  var result: String
}

object VoiceRecognizeResponse {
  @scala.inline
  def apply(result: String): VoiceRecognizeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceRecognizeResponse]
  }
}

