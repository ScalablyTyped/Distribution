package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_Swanid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwanIdTask extends js.Object {
  var data: Anon_Swanid
  var errno: String
}

object SwanIdTask {
  @scala.inline
  def apply(data: Anon_Swanid, errno: String): SwanIdTask = {
    val __obj = js.Dynamic.literal(data = data, errno = errno)
  
    __obj.asInstanceOf[SwanIdTask]
  }
}

