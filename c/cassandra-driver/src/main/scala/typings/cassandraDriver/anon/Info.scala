package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Info extends js.Object {
  var code: Double = js.native
  var info: js.Any = js.native
}

object Info {
  @scala.inline
  def apply(code: Double, info: js.Any): Info = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
  }
  
}

