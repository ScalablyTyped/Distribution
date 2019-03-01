package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textToAudioResponse extends js.Object {
  var filePath: java.lang.String
}

object textToAudioResponse {
  @scala.inline
  def apply(filePath: java.lang.String): textToAudioResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    __obj.asInstanceOf[textToAudioResponse]
  }
}

