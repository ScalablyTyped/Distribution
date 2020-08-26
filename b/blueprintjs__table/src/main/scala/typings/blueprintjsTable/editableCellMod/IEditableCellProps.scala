package typings.blueprintjsTable.editableCellMod

import typings.blueprintjsCore.editableTextMod.IEditableTextProps
import typings.blueprintjsTable.cellMod.ICellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditableCellProps extends ICellProps {
  /**
    * Props that should be passed to the EditableText when it is used to edit
    */
  var editableTextProps: js.UndefOr[IEditableTextProps] = js.native
  /**
    * Whether the given cell is the current active/focused cell.
    */
  var isFocused: js.UndefOr[Boolean] = js.native
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onCancel: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the <code>return</code> (or <code>enter</code>) key press.
    * The callback will also receive the row index and column index if they
    * were originally provided via props.
    */
  var onConfirm: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * The value displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var value: js.UndefOr[String] = js.native
}

object IEditableCellProps {
  @scala.inline
  def apply(): IEditableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditableCellProps]
  }
  @scala.inline
  implicit class IEditableCellPropsOps[Self <: IEditableCellProps] (val x: Self) extends AnyVal {
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
    def setEditableTextProps(value: IEditableTextProps): Self = this.set("editableTextProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditableTextProps: Self = this.set("editableTextProps", js.undefined)
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setOnCancel(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onCancel", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnConfirm(
      value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onConfirm", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

