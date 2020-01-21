package typings.datatablesNetKeytable.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTableSettings extends js.Object {
  /*
    * Allow KeyTable's focus to be blurred (removed) from a table
    *
    * When set to true this option allows the table to lose focus (i.e. to be blurred),
    * while false will not allow the table to lose focus.
    */
  var blurable: js.UndefOr[Boolean] = js.undefined
  /*
    * Set the class name used for the focused cell
    *
    * The class name to be added and removed from cells as they gain and loose focus.
    */
  var className: js.UndefOr[String] = js.undefined
  /*
    * Enable / disable clipboard interaction with KeyTable
    *
    * A boolean flag that can optionally be used to disable KeyTables' clipboard interaction.
    */
  var clipboard: js.UndefOr[Boolean] = js.undefined
  /*
    * Set the orthogonal data point for the data to copy to clipboard.
    */
  var clipboardOrthogonal: js.UndefOr[String] = js.undefined
  /*
    * Select the columns that can gain focus
    *
    * The columns that can gain focus. This accepts all of the options of column-selector
    * such as class name selector, jQuery pseudo selects and column index selectors.
    */
  var columns: js.UndefOr[js.Any] = js.undefined
  /*
    * Control if editing should be activated immediately upon focus
    *
    * true to enable editing on focus, false to disable.
    */
  var editOnFocus: js.UndefOr[Boolean] = js.undefined
  /*
    * Attach an Editor instance for Excel like editing
    *
    * The Editor instance to use for editing of the table
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  /*
    * Cell to receive initial focus in the table
    *
    * The cell that will receive focus when the table is initialised. This accepts all of
    * the options of cell-selector such as class name selector, jQuery pseudo selects and
    * cell index selectors.
    */
  var focus: js.UndefOr[js.Any] = js.undefined
  /*
    * Limit the keys that KeyTable will listen for and take action on
    *
    * As null KeyTable will listen for all key presses, regardless of what key is pressed.
    * an array you can limit the keys that KeyTable will take action on to just the key
    * codes given in the array.
    */
  var keys: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /*
    * Set the table's tab index for when it will receive focus
    *
    * The tab index for the table. Like all other tab indexes, this can be -1 to disallow
    * tabbing into the table.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object KeyTableSettings {
  @scala.inline
  def apply(
    blurable: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clipboard: js.UndefOr[Boolean] = js.undefined,
    clipboardOrthogonal: String = null,
    columns: js.Any = null,
    editOnFocus: js.UndefOr[Boolean] = js.undefined,
    editor: js.Any = null,
    focus: js.Any = null,
    keys: js.Array[Double] = null,
    tabIndex: Int | Double = null
  ): KeyTableSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blurable)) __obj.updateDynamic("blurable")(blurable.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboard)) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (clipboardOrthogonal != null) __obj.updateDynamic("clipboardOrthogonal")(clipboardOrthogonal.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(editOnFocus)) __obj.updateDynamic("editOnFocus")(editOnFocus.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyTableSettings]
  }
}

