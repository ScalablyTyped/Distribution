package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownProperties extends ComponentProperties {
  var editable: js.UndefOr[Boolean] = js.undefined
  var fireOnTextChange: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | CategoryValue] = js.undefined
  var values: js.UndefOr[js.Array[CategoryValue | String]] = js.undefined
}

object DropDownProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    display: DisplayType = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fireOnTextChange: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    position: PositionType = null,
    required: js.UndefOr[Boolean] = js.undefined,
    value: String | CategoryValue = null,
    values: js.Array[CategoryValue | String] = null,
    width: Double | String = null
  ): DropDownProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnTextChange)) __obj.updateDynamic("fireOnTextChange")(fireOnTextChange.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownProperties]
  }
}

