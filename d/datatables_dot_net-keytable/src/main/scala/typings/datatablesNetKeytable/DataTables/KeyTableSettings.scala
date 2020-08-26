package typings.datatablesNetKeytable.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyTableSettings extends js.Object {
  /*
    * Allow KeyTable's focus to be blurred (removed) from a table
    *
    * When set to true this option allows the table to lose focus (i.e. to be blurred),
    * while false will not allow the table to lose focus.
    */
  var blurable: js.UndefOr[Boolean] = js.native
  /*
    * Set the class name used for the focused cell
    *
    * The class name to be added and removed from cells as they gain and loose focus.
    */
  var className: js.UndefOr[String] = js.native
  /*
    * Enable / disable clipboard interaction with KeyTable
    *
    * A boolean flag that can optionally be used to disable KeyTables' clipboard interaction.
    */
  var clipboard: js.UndefOr[Boolean] = js.native
  /*
    * Set the orthogonal data point for the data to copy to clipboard.
    */
  var clipboardOrthogonal: js.UndefOr[String] = js.native
  /*
    * Select the columns that can gain focus
    *
    * The columns that can gain focus. This accepts all of the options of column-selector
    * such as class name selector, jQuery pseudo selects and column index selectors.
    */
  var columns: js.UndefOr[js.Any] = js.native
  /*
    * Control if editing should be activated immediately upon focus
    *
    * true to enable editing on focus, false to disable.
    */
  var editOnFocus: js.UndefOr[Boolean] = js.native
  /*
    * Attach an Editor instance for Excel like editing
    *
    * The Editor instance to use for editing of the table
    */
  var editor: js.UndefOr[js.Any] = js.native
  /*
    * Cell to receive initial focus in the table
    *
    * The cell that will receive focus when the table is initialised. This accepts all of
    * the options of cell-selector such as class name selector, jQuery pseudo selects and
    * cell index selectors.
    */
  var focus: js.UndefOr[js.Any] = js.native
  /*
    * Limit the keys that KeyTable will listen for and take action on
    *
    * As null KeyTable will listen for all key presses, regardless of what key is pressed.
    * an array you can limit the keys that KeyTable will take action on to just the key
    * codes given in the array.
    */
  var keys: js.UndefOr[js.Array[Double] | Null] = js.native
  /*
    * Set the table's tab index for when it will receive focus
    *
    * The tab index for the table. Like all other tab indexes, this can be -1 to disallow
    * tabbing into the table.
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object KeyTableSettings {
  @scala.inline
  def apply(): KeyTableSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyTableSettings]
  }
  @scala.inline
  implicit class KeyTableSettingsOps[Self <: KeyTableSettings] (val x: Self) extends AnyVal {
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
    def setBlurable(value: Boolean): Self = this.set("blurable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurable: Self = this.set("blurable", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClipboard(value: Boolean): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    @scala.inline
    def setClipboardOrthogonal(value: String): Self = this.set("clipboardOrthogonal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipboardOrthogonal: Self = this.set("clipboardOrthogonal", js.undefined)
    @scala.inline
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEditOnFocus(value: Boolean): Self = this.set("editOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditOnFocus: Self = this.set("editOnFocus", js.undefined)
    @scala.inline
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setFocus(value: js.Any): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setKeysVarargs(value: Double*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[Double]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setKeysNull: Self = this.set("keys", null)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

