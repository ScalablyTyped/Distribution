package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.anon.Dark
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProperties
  extends ComponentProperties
     with ComponentWithIcon {
  /**
    * The content of the currently selected file
    */
  var fileContent: js.UndefOr[String] = js.undefined
  /**
    * Whether the button opens the file browser dialog
    */
  var isFile: js.UndefOr[Boolean] = js.undefined
  /**
    * The label for the button
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    *
    * The title for the button. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.undefined
}

object ButtonProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fileContent: String = null,
    height: Double | String = null,
    iconHeight: Double | String = null,
    iconPath: String | Uri | Dark = null,
    iconWidth: Double | String = null,
    isFile: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    position: PositionType = null,
    title: String = null,
    width: Double | String = null
  ): ButtonProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.get.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fileContent != null) __obj.updateDynamic("fileContent")(fileContent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isFile)) __obj.updateDynamic("isFile")(isFile.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProperties]
  }
}

