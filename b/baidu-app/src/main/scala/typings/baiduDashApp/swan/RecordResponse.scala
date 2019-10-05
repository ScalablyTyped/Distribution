package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordResponse extends js.Object {
  var tempThumbPath: String
  var tempVideoPath: String
}

object RecordResponse {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): RecordResponse = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath, tempVideoPath = tempVideoPath)
  
    __obj.asInstanceOf[RecordResponse]
  }
}

