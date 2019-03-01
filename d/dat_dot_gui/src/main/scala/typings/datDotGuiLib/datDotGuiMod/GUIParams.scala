package typings
package datDotGuiLib.datDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GUIParams extends js.Object {
  /**
    * Handles GUI's element placement for you.
    * @default true
    */
  var autoPlace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, close/open button shows on top of the GUI.
    * @default false
    */
  var closeOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, starts closed.
    * @default false
    */
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, GUI is closed by the "h" keypress.
    * @default false
    */
  var hideable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * JSON object representing the saved state of this GUI.
    */
  var load: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of this GUI.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier for a set of saved values.
    */
  var preset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of GUI element.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GUIParams {
  @scala.inline
  def apply(
    autoPlace: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    hideable: js.UndefOr[scala.Boolean] = js.undefined,
    load: js.Any = null,
    name: java.lang.String = null,
    preset: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): GUIParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlace)) __obj.updateDynamic("autoPlace")(autoPlace)
    if (!js.isUndefined(closeOnTop)) __obj.updateDynamic("closeOnTop")(closeOnTop)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (!js.isUndefined(hideable)) __obj.updateDynamic("hideable")(hideable)
    if (load != null) __obj.updateDynamic("load")(load)
    if (name != null) __obj.updateDynamic("name")(name)
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GUIParams]
  }
}

