package typings.datatablesNetColreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColReorderSettings extends js.Object {
  /*
    * Number of columns (counting from the left) to disallow reordering of, '0' in default
    */
  var fixedColumnsLeft: js.UndefOr[Double] = js.native
  /*
    * Number of columns (counting from the right) to disallow reordering of, '0' in default
    */
  var fixedColumnsRight: js.UndefOr[Double] = js.native
  /*
    * Set a default order for the columns in the table
    */
  var order: js.UndefOr[js.Array[Double]] = js.native
  /*
    * Enable / disable live reordering of columns during a drag, 'true' in default
    */
  var realtime: js.UndefOr[Boolean] = js.native
  /*
    * Callback after reorder
    */
  def reorderCallback(): Unit = js.native
}

object ColReorderSettings {
  @scala.inline
  def apply(reorderCallback: () => Unit): ColReorderSettings = {
    val __obj = js.Dynamic.literal(reorderCallback = js.Any.fromFunction0(reorderCallback))
    __obj.asInstanceOf[ColReorderSettings]
  }
  @scala.inline
  implicit class ColReorderSettingsOps[Self <: ColReorderSettings] (val x: Self) extends AnyVal {
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
    def setReorderCallback(value: () => Unit): Self = this.set("reorderCallback", js.Any.fromFunction0(value))
    @scala.inline
    def setFixedColumnsLeft(value: Double): Self = this.set("fixedColumnsLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedColumnsLeft: Self = this.set("fixedColumnsLeft", js.undefined)
    @scala.inline
    def setFixedColumnsRight(value: Double): Self = this.set("fixedColumnsRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedColumnsRight: Self = this.set("fixedColumnsRight", js.undefined)
    @scala.inline
    def setOrderVarargs(value: Double*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
  }
  
}

