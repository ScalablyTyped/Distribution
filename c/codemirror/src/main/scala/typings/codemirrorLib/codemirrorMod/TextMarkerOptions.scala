package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMarkerOptions extends js.Object {
  /** When set to true (default is false), adding this marker will create an event in the undo history that can be individually undone(clearing the marker). */
  var addToHistory: js.UndefOr[scala.Boolean] = js.undefined
  /** Atomic ranges act as a single unit when cursor movement is concerned — i.e. it is impossible to place the cursor inside of them.
    In atomic ranges, inclusiveLeft and inclusiveRight have a different meaning — they will prevent the cursor from being placed
    respectively directly before and directly after the range. */
  var atomic: js.UndefOr[scala.Boolean] = js.undefined
  /** Assigns a CSS class to the marked stretch of text. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** When enabled, will cause the mark to clear itself whenever the cursor enters its range.
    This is mostly useful for text - replacement widgets that need to 'snap open' when the user tries to edit them.
    The "clear" event fired on the range handle can be used to be notified when this happens. */
  var clearOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether the mark is automatically cleared when it becomes empty. Default is true. */
  var clearWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /** Collapsed ranges do not show up in the display.Setting a range to be collapsed will automatically make it atomic. */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /** A string of CSS to be applied to the covered text. For example "color: #fe3". */
  var css: js.UndefOr[java.lang.String] = js.undefined
  /** Equivalent to startStyle, but for the rightmost span. */
  var endStyle: js.UndefOr[java.lang.String] = js.undefined
  /** When replacedWith is given, this determines whether the editor will
    * capture mouse and drag events occurring in this widget. Default is
    * false—the events will be left alone for the default browser handler,
    * or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether text inserted on the left of the marker will end up inside or outside of it. */
  var inclusiveLeft: js.UndefOr[scala.Boolean] = js.undefined
  /** Like inclusiveLeft , but for the right side. */
  var inclusiveRight: js.UndefOr[scala.Boolean] = js.undefined
  /** A read - only span can, as long as it is not cleared, not be modified except by calling setValue to reset the whole document.
    Note: adding a read - only span currently clears the undo history of the editor,
    because existing undo events being partially nullified by read - only spans would corrupt the history (in the current implementation). */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Use a given node to display this range.Implies both collapsed and atomic.
    The given DOM node must be an inline element(as opposed to a block element). */
  var replacedWith: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** When the target document is linked to other documents, you can set shared to true to make the marker appear in all documents.
    By default, a marker appears only in its target document. */
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be used to specify an extra CSS class to be applied to the leftmost span that is part of the marker. */
  var startStyle: js.UndefOr[java.lang.String] = js.undefined
  /** When given, will give the nodes created for this span a HTML title attribute with the given value. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TextMarkerOptions {
  @scala.inline
  def apply(
    addToHistory: js.UndefOr[scala.Boolean] = js.undefined,
    atomic: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clearOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    clearWhenEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    css: java.lang.String = null,
    endStyle: java.lang.String = null,
    handleMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    inclusiveLeft: js.UndefOr[scala.Boolean] = js.undefined,
    inclusiveRight: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    replacedWith: stdLib.HTMLElement = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    startStyle: java.lang.String = null,
    title: java.lang.String = null
  ): TextMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToHistory)) __obj.updateDynamic("addToHistory")(addToHistory)
    if (!js.isUndefined(atomic)) __obj.updateDynamic("atomic")(atomic)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clearOnEnter)) __obj.updateDynamic("clearOnEnter")(clearOnEnter)
    if (!js.isUndefined(clearWhenEmpty)) __obj.updateDynamic("clearWhenEmpty")(clearWhenEmpty)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (css != null) __obj.updateDynamic("css")(css)
    if (endStyle != null) __obj.updateDynamic("endStyle")(endStyle)
    if (!js.isUndefined(handleMouseEvents)) __obj.updateDynamic("handleMouseEvents")(handleMouseEvents)
    if (!js.isUndefined(inclusiveLeft)) __obj.updateDynamic("inclusiveLeft")(inclusiveLeft)
    if (!js.isUndefined(inclusiveRight)) __obj.updateDynamic("inclusiveRight")(inclusiveRight)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (replacedWith != null) __obj.updateDynamic("replacedWith")(replacedWith)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (startStyle != null) __obj.updateDynamic("startStyle")(startStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TextMarkerOptions]
  }
}

