package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textToAudioResponse extends js.Object {
  var filePath: String
}

object textToAudioResponse {
  @scala.inline
  def apply(filePath: String): textToAudioResponse = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[textToAudioResponse]
  }
}

