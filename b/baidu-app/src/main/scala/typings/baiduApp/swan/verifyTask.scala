package typings.baiduApp.swan

import typings.baiduApp.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait verifyTask extends js.Object {
  var data: Result = js.native
  var errmsg: String = js.native
  var errno: String = js.native
}

object verifyTask {
  @scala.inline
  def apply(data: Result, errmsg: String, errno: String): verifyTask = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any])
    __obj.asInstanceOf[verifyTask]
  }
  @scala.inline
  implicit class verifyTaskOps[Self <: verifyTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Result): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrmsg(value: String): Self = this.set("errmsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrno(value: String): Self = this.set("errno", value.asInstanceOf[js.Any])
  }
  
}

