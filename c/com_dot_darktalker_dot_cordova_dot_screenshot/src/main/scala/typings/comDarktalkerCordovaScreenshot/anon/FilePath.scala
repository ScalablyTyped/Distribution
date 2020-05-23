package typings.comDarktalkerCordovaScreenshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePath extends js.Object {
  var filePath: String
  var success: Boolean
}

object FilePath {
  @scala.inline
  def apply(filePath: String, success: Boolean): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
}

