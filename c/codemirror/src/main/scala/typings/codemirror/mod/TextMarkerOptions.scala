package typings.codemirror.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMarkerOptions extends js.Object {
  /** When set to true (default is false), adding this marker will create an event in the undo history that can be individually undone(clearing the marker). */
  var addToHistory: js.UndefOr[Boolean] = js.native
  /** Atomic ranges act as a single unit when cursor movement is concerned — i.e. it is impossible to place the cursor inside of them.
    In atomic ranges, inclusiveLeft and inclusiveRight have a different meaning — they will prevent the cursor from being placed
    respectively directly before and directly after the range. */
  var atomic: js.UndefOr[Boolean] = js.native
  /** Assigns a CSS class to the marked stretch of text. */
  var className: js.UndefOr[String] = js.native
  /** When enabled, will cause the mark to clear itself whenever the cursor enters its range.
    This is mostly useful for text - replacement widgets that need to 'snap open' when the user tries to edit them.
    The "clear" event fired on the range handle can be used to be notified when this happens. */
  var clearOnEnter: js.UndefOr[Boolean] = js.native
  /** Determines whether the mark is automatically cleared when it becomes empty. Default is true. */
  var clearWhenEmpty: js.UndefOr[Boolean] = js.native
  /** Collapsed ranges do not show up in the display.Setting a range to be collapsed will automatically make it atomic. */
  var collapsed: js.UndefOr[Boolean] = js.native
  /** A string of CSS to be applied to the covered text. For example "color: #fe3". */
  var css: js.UndefOr[String] = js.native
  /** Equivalent to startStyle, but for the rightmost span. */
  var endStyle: js.UndefOr[String] = js.native
  /** When replacedWith is given, this determines whether the editor will
    * capture mouse and drag events occurring in this widget. Default is
    * false—the events will be left alone for the default browser handler,
    * or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  /** Determines whether text inserted on the left of the marker will end up inside or outside of it. */
  var inclusiveLeft: js.UndefOr[Boolean] = js.native
  /** Like inclusiveLeft , but for the right side. */
  var inclusiveRight: js.UndefOr[Boolean] = js.native
  /** A read - only span can, as long as it is not cleared, not be modified except by calling setValue to reset the whole document.
    Note: adding a read - only span currently clears the undo history of the editor,
    because existing undo events being partially nullified by read - only spans would corrupt the history (in the current implementation). */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Use a given node to display this range.Implies both collapsed and atomic.
    The given DOM node must be an inline element(as opposed to a block element). */
  var replacedWith: js.UndefOr[HTMLElement] = js.native
  /** When the target document is linked to other documents, you can set shared to true to make the marker appear in all documents.
    By default, a marker appears only in its target document. */
  var shared: js.UndefOr[Boolean] = js.native
  /** Can be used to specify an extra CSS class to be applied to the leftmost span that is part of the marker. */
  var startStyle: js.UndefOr[String] = js.native
  /** When given, will give the nodes created for this span a HTML title attribute with the given value. */
  var title: js.UndefOr[String] = js.native
}

object TextMarkerOptions {
  @scala.inline
  def apply(): TextMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextMarkerOptions]
  }
  @scala.inline
  implicit class TextMarkerOptionsOps[Self <: TextMarkerOptions] (val x: Self) extends AnyVal {
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
    def setAddToHistory(value: Boolean): Self = this.set("addToHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddToHistory: Self = this.set("addToHistory", js.undefined)
    @scala.inline
    def setAtomic(value: Boolean): Self = this.set("atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtomic: Self = this.set("atomic", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearOnEnter(value: Boolean): Self = this.set("clearOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearOnEnter: Self = this.set("clearOnEnter", js.undefined)
    @scala.inline
    def setClearWhenEmpty(value: Boolean): Self = this.set("clearWhenEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearWhenEmpty: Self = this.set("clearWhenEmpty", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setEndStyle(value: String): Self = this.set("endStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndStyle: Self = this.set("endStyle", js.undefined)
    @scala.inline
    def setHandleMouseEvents(value: Boolean): Self = this.set("handleMouseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleMouseEvents: Self = this.set("handleMouseEvents", js.undefined)
    @scala.inline
    def setInclusiveLeft(value: Boolean): Self = this.set("inclusiveLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusiveLeft: Self = this.set("inclusiveLeft", js.undefined)
    @scala.inline
    def setInclusiveRight(value: Boolean): Self = this.set("inclusiveRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusiveRight: Self = this.set("inclusiveRight", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReplacedWith(value: HTMLElement): Self = this.set("replacedWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacedWith: Self = this.set("replacedWith", js.undefined)
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def setStartStyle(value: String): Self = this.set("startStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartStyle: Self = this.set("startStyle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

