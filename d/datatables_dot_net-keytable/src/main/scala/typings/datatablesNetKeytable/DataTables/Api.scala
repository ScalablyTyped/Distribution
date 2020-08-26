package typings.datatablesNetKeytable.DataTables

import typings.datatablesNetKeytable.anon.Disable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var keys: Disable = js.native
}

object Api {
  @scala.inline
  def apply(keys: Disable): Api = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
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
    def setKeys(value: Disable): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

