package typings.baiduApp.swan

import typings.baiduApp.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait verifyTask extends js.Object {
  var data: Result
  var errmsg: String
  var errno: String
}

object verifyTask {
  @scala.inline
  def apply(data: Result, errmsg: String, errno: String): verifyTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[verifyTask]
  }
}

