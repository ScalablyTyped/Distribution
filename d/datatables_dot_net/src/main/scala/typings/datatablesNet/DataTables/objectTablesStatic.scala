package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait objectTablesStatic extends js.Object {
  /**
    * Return a DataTables API instance for the selected tables (true) or an array (false).
    */
  var api: Boolean = js.native
  /**
    * Get only visible tables (true) or all tables regardless of visibility (false).
    */
  var visible: Boolean = js.native
}

object objectTablesStatic {
  @scala.inline
  def apply(api: Boolean, visible: Boolean): objectTablesStatic = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[objectTablesStatic]
  }
  @scala.inline
  implicit class objectTablesStaticOps[Self <: objectTablesStatic] (val x: Self) extends AnyVal {
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
    def setApi(value: Boolean): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

