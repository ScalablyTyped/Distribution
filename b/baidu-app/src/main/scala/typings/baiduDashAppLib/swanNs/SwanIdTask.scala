package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwanIdTask extends js.Object {
  var data: baiduDashAppLib.Anon_Swanid
  var errno: java.lang.String
}

object SwanIdTask {
  @scala.inline
  def apply(data: baiduDashAppLib.Anon_Swanid, errno: java.lang.String): SwanIdTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errno")(errno)
    __obj.asInstanceOf[SwanIdTask]
  }
}

