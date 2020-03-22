package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBoxProperties extends ComponentProperties {
  var ariaLive: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var inputType: js.UndefOr[InputBoxInputType] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var placeHolder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  /**
  		 * Whether to stop key event propagation when enter is pressed in the input box. Leaving this as false
  		 * means the event will propagate up to any parents that have handlers (such as validate on Dialogs)
  		 */
  var stopEnterPropagation: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InputBoxProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaLive: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    columns: Int | Double = null,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    inputType: InputBoxInputType = null,
    max: Int | Double = null,
    min: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    placeHolder: String = null,
    position: PositionType = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    stopEnterPropagation: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    width: Double | String = null
  ): InputBoxProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLive != null) __obj.updateDynamic("ariaLive")(ariaLive.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEnterPropagation)) __obj.updateDynamic("stopEnterPropagation")(stopEnterPropagation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputBoxProperties]
  }
}

