package typings.blueprintjsTable.cellMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellProps
  extends IIntentProps
     with IProps {
  /**
    * A ref handle to capture the outer div of this cell. Used internally.
    */
  var cellRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
  /**
    * The column index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * If `true`, the cell will be rendered above overlay layers to enable mouse
    * interactions within the cell.
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  /**
    * An optional native tooltip that is displayed on hover.
    * If `true`, content will be replaced with a fixed-height skeleton.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked when the cell is focused and a key is pressed down.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * Callback invoked when a character-key is pressed.
    */
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * Callback invoked when the cell is focused and a key is released.
    */
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  /**
    * The row index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Allows for setting a tab index on the cell, so the cell can be browser-focusable.
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * An optional native tooltip that is displayed on hover.
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will prevent the content from overflowing the cell.
    * @default true
    */
  var truncated: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will cause text to wrap, rather than displaying it on a single line.
    * @default false
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object ICellProps {
  @scala.inline
  def apply(): ICellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellProps]
  }
  @scala.inline
  implicit class ICellPropsOps[Self <: ICellProps] (val x: Self) extends AnyVal {
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
    def setCellRef(value: /* ref */ HTMLElement | Null => Unit): Self = this.set("cellRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellRef: Self = this.set("cellRef", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapText: Self = this.set("wrapText", js.undefined)
  }
  
}

