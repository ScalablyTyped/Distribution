package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidgetOptions extends js.Object {
  /** Causes the widget to be placed above instead of below the text of the line. */
  var above: js.UndefOr[Boolean] = js.undefined
  /** Add an extra CSS class name to the wrapper element created for the widget. */
  var className: js.UndefOr[String] = js.undefined
  /** Whether the widget should cover the gutter. */
  var coverGutter: js.UndefOr[Boolean] = js.undefined
  /** Determines whether the editor will capture mouse and drag events occurring in this widget.
    Default is false—the events will be left alone for the default browser handler, or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.undefined
  /** By default, the widget is added below other widgets for the line.
    This option can be used to place it at a different position (zero for the top, N to put it after the Nth other widget).
    Note that this only has effect once, when the widget is created. */
  var insertAt: js.UndefOr[Double] = js.undefined
  /** Whether the widget should stay fixed in the face of horizontal scrolling. */
  var noHScroll: js.UndefOr[Boolean] = js.undefined
  /** When true, will cause the widget to be rendered even if the line it is associated with is hidden. */
  var showIfHidden: js.UndefOr[Boolean] = js.undefined
}

object LineWidgetOptions {
  @scala.inline
  def apply(
    above: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    coverGutter: js.UndefOr[Boolean] = js.undefined,
    handleMouseEvents: js.UndefOr[Boolean] = js.undefined,
    insertAt: js.UndefOr[Double] = js.undefined,
    noHScroll: js.UndefOr[Boolean] = js.undefined,
    showIfHidden: js.UndefOr[Boolean] = js.undefined
  ): LineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(above)) __obj.updateDynamic("above")(above.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(coverGutter)) __obj.updateDynamic("coverGutter")(coverGutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleMouseEvents)) __obj.updateDynamic("handleMouseEvents")(handleMouseEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertAt)) __obj.updateDynamic("insertAt")(insertAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noHScroll)) __obj.updateDynamic("noHScroll")(noHScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIfHidden)) __obj.updateDynamic("showIfHidden")(showIfHidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidgetOptions]
  }
}

