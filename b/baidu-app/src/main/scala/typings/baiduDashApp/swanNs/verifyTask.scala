package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait verifyTask extends js.Object {
  var data: Anon_Result
  var errmsg: String
  var errno: String
}

object verifyTask {
  @scala.inline
  def apply(data: Anon_Result, errmsg: String, errno: String): verifyTask = {
    val __obj = js.Dynamic.literal(data = data, errmsg = errmsg, errno = errno)
  
    __obj.asInstanceOf[verifyTask]
  }
}

