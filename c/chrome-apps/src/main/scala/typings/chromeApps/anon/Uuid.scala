package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uuid extends js.Object {
  var data: js.Array[integer] = js.native
  var uuid: String = js.native
}

object Uuid {
  @scala.inline
  def apply(data: js.Array[integer], uuid: String): Uuid = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  @scala.inline
  implicit class UuidOps[Self <: Uuid] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: integer*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[integer]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

