package typings.baiduDashApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceErrorResponse extends js.Object {
  var result: String
}

object VoiceErrorResponse {
  @scala.inline
  def apply(result: String): VoiceErrorResponse = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[VoiceErrorResponse]
  }
}

