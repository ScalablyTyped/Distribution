package typings.comDarktalkerCordovaScreenshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilePath extends js.Object {
  var filePath: String
  var success: Boolean
}

object AnonFilePath {
  @scala.inline
  def apply(filePath: String, success: Boolean): AnonFilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilePath]
  }
}

