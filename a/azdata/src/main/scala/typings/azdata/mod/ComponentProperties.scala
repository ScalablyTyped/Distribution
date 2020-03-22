package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProperties extends js.Object {
  /**
  		 * Matches the CSS style key and its available values.
  		 */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * Corresponds to the aria-label accessibility attribute for this component
  		 */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
  		 * Corresponds to the role accessibility attribute for this component
  		 */
  var ariaRole: js.UndefOr[String] = js.undefined
  /**
  		 * Corresponds to the aria-selected accessibility attribute for this component
  		 */
  var ariaSelected: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Corresponds to the display CSS property for the element
  		 */
  var display: js.UndefOr[DisplayType] = js.undefined
  /**
  		 * Whether the component is enabled in the DOM
  		 */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  /**
  		 * The position CSS property. Empty by default.
  		 * This is particularly useful if laying out components inside a FlexContainer and
  		 * the size of the component is meant to be a fixed size. In this case the position must be
  		 * set to 'absolute', with the parent FlexContainer having 'relative' position.
  		 * Without this the component will fail to correctly size itself
  		 */
  var position: js.UndefOr[PositionType] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ComponentProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    position: PositionType = null,
    width: Double | String = null
  ): ComponentProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProperties]
  }
}

