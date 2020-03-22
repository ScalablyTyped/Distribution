package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.AnonDark
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageComponentProperties
  extends ComponentProperties
     with ComponentWithIcon

object ImageComponentProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    iconHeight: Double | String = null,
    iconPath: String | Uri | AnonDark = null,
    iconWidth: Double | String = null,
    position: PositionType = null,
    width: Double | String = null
  ): ImageComponentProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageComponentProperties]
  }
}

