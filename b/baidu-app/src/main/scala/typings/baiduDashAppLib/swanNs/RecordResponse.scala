package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordResponse extends js.Object {
  var tempThumbPath: java.lang.String
  var tempVideoPath: java.lang.String
}

object RecordResponse {
  @scala.inline
  def apply(tempThumbPath: java.lang.String, tempVideoPath: java.lang.String): RecordResponse = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath, tempVideoPath = tempVideoPath)
  
    __obj.asInstanceOf[RecordResponse]
  }
}

