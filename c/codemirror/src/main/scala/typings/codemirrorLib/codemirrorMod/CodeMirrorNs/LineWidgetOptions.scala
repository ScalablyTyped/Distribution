package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineWidgetOptions extends js.Object {
  /** Causes the widget to be placed above instead of below the text of the line. */
  var above: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the widget should cover the gutter. */
  var coverGutter: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the widget should stay fixed in the face of horizontal scrolling. */
  var noHScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** When true, will cause the widget to be rendered even if the line it is associated with is hidden. */
  var showIfHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object LineWidgetOptions {
  @scala.inline
  def apply(
    above: js.UndefOr[scala.Boolean] = js.undefined,
    coverGutter: js.UndefOr[scala.Boolean] = js.undefined,
    noHScroll: js.UndefOr[scala.Boolean] = js.undefined,
    showIfHidden: js.UndefOr[scala.Boolean] = js.undefined
  ): LineWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(above)) __obj.updateDynamic("above")(above)
    if (!js.isUndefined(coverGutter)) __obj.updateDynamic("coverGutter")(coverGutter)
    if (!js.isUndefined(noHScroll)) __obj.updateDynamic("noHScroll")(noHScroll)
    if (!js.isUndefined(showIfHidden)) __obj.updateDynamic("showIfHidden")(showIfHidden)
    __obj.asInstanceOf[LineWidgetOptions]
  }
}

