package typings.azureKustoData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mgmt extends js.Object {
  var mgmt: String = js.native
  var query: String = js.native
}

object Mgmt {
  @scala.inline
  def apply(mgmt: String, query: String): Mgmt = {
    val __obj = js.Dynamic.literal(mgmt = mgmt.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mgmt]
  }
  @scala.inline
  implicit class MgmtOps[Self <: Mgmt] (val x: Self) extends AnyVal {
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
    def setMgmt(value: String): Self = this.set("mgmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

