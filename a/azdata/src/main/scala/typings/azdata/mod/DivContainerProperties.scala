package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivContainerProperties extends ComponentProperties {
  /**
  		 * Indicates whether the element is clickable
  		 */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Matches the overflow-y CSS property and its available values.
  		 */
  var overflowY: js.UndefOr[String] = js.undefined
  /**
  		 * Setting the scroll based on the y offset
  		 * This is used when its child component is webview
  		 */
  var yOffsetChange: js.UndefOr[Double] = js.undefined
}

object DivContainerProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    overflowY: String = null,
    position: PositionType = null,
    width: Double | String = null,
    yOffsetChange: Int | Double = null
  ): DivContainerProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yOffsetChange != null) __obj.updateDynamic("yOffsetChange")(yOffsetChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivContainerProperties]
  }
}

