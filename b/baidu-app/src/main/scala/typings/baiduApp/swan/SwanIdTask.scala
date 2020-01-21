package typings.baiduApp.swan

import typings.baiduApp.AnonSwanid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwanIdTask extends js.Object {
  var data: AnonSwanid
  var errno: String
}

object SwanIdTask {
  @scala.inline
  def apply(data: AnonSwanid, errno: String): SwanIdTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SwanIdTask]
  }
}

