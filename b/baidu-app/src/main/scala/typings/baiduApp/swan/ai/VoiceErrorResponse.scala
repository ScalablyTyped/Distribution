package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceErrorResponse extends js.Object {
  var result: String
}

object VoiceErrorResponse {
  @scala.inline
  def apply(result: String): VoiceErrorResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoiceErrorResponse]
  }
}

