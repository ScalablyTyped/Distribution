package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait verifyTask extends js.Object {
  var data: baiduDashAppLib.Anon_Result
  var errmsg: java.lang.String
  var errno: java.lang.String
}

object verifyTask {
  @scala.inline
  def apply(data: baiduDashAppLib.Anon_Result, errmsg: java.lang.String, errno: java.lang.String): verifyTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errmsg")(errmsg)
    __obj.updateDynamic("errno")(errno)
    __obj.asInstanceOf[verifyTask]
  }
}

