package typings.datDotGui.datDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GUIParams extends js.Object {
  /**
    * Handles GUI's element placement for you.
    * @default true
    */
  var autoPlace: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, close/open button shows on top of the GUI.
    * @default false
    */
  var closeOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, starts closed.
    * @default false
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, GUI is closed by the "h" keypress.
    * @default false
    */
  var hideable: js.UndefOr[Boolean] = js.undefined
  /**
    * JSON object representing the saved state of this GUI.
    */
  var load: js.UndefOr[js.Any] = js.undefined
  /**
    * The name of this GUI.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The identifier for a set of saved values.
    */
  var preset: js.UndefOr[String] = js.undefined
  /**
    * The width of GUI element.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object GUIParams {
  @scala.inline
  def apply(
    autoPlace: js.UndefOr[Boolean] = js.undefined,
    closeOnTop: js.UndefOr[Boolean] = js.undefined,
    closed: js.UndefOr[Boolean] = js.undefined,
    hideable: js.UndefOr[Boolean] = js.undefined,
    load: js.Any = null,
    name: String = null,
    preset: String = null,
    width: Int | Double = null
  ): GUIParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlace)) __obj.updateDynamic("autoPlace")(autoPlace.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTop)) __obj.updateDynamic("closeOnTop")(closeOnTop.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (!js.isUndefined(hideable)) __obj.updateDynamic("hideable")(hideable.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GUIParams]
  }
}

