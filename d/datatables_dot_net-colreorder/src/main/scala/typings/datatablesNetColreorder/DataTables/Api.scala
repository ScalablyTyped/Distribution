package typings.datatablesNetColreorder.DataTables

import typings.datatablesNetColreorder.anon.Move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var colReorder: Move = js.native
}

object Api {
  @scala.inline
  def apply(colReorder: Move): Api = {
    val __obj = js.Dynamic.literal(colReorder = colReorder.asInstanceOf[js.Any])
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
    def setColReorder(value: Move): Self = this.set("colReorder", value.asInstanceOf[js.Any])
  }
  
}

