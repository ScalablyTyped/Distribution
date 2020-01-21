package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidgetOptions extends js.Object {
  /** Causes the widget to be placed above instead of below the text of the line. */
  var above: js.UndefOr[Boolean] = js.undefined
  /** Whether the widget should cover the gutter. */
  var coverGutter: js.UndefOr[Boolean] = js.undefined
  /** Whether the widget should stay fixed in the face of horizontal scrolling. */
  var noHScroll: js.UndefOr[Boolean] = js.undefined
  /** When true, will cause the widget to be rendered even if the line it is associated with is hidden. */
  var showIfHidden: js.UndefOr[Boolean] = js.undefined
}

object LineWidgetOptions {
  @scala.inline
  def apply(
    above: js.UndefOr[Boolean] = js.undefined,
    coverGutter: js.UndefOr[Boolean] = js.undefined,
    noHScroll: js.UndefOr[Boolean] = js.undefined,
    showIfHidden: js.UndefOr[Boolean] = js.undefined
  ): LineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(above)) __obj.updateDynamic("above")(above.asInstanceOf[js.Any])
    if (!js.isUndefined(coverGutter)) __obj.updateDynamic("coverGutter")(coverGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(noHScroll)) __obj.updateDynamic("noHScroll")(noHScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showIfHidden)) __obj.updateDynamic("showIfHidden")(showIfHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidgetOptions]
  }
}

