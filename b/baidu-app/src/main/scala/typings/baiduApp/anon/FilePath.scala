package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePath extends js.Object {
  var filePath: String
}

object FilePath {
  @scala.inline
  def apply(filePath: String): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
}

