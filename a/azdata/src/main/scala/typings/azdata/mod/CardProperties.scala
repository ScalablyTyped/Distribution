package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.anon.Dark
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProperties
  extends ComponentProperties
     with ComponentWithIcon {
  var actions: js.UndefOr[js.Array[ActionDescriptor]] = js.undefined
  /**
    * Card Type, default: Details
    */
  var cardType: js.UndefOr[CardType] = js.undefined
  var descriptions: js.UndefOr[js.Array[CardDescriptionItem]] = js.undefined
  var label: String
  /**
    * Returns true if the card is selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[StatusIndicator] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CardProperties {
  @scala.inline
  def apply(
    label: String,
    CSSStyles: StringDictionary[String] = null,
    actions: js.Array[ActionDescriptor] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    cardType: CardType = null,
    descriptions: js.Array[CardDescriptionItem] = null,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    iconHeight: Double | String = null,
    iconPath: String | Uri | Dark = null,
    iconWidth: Double | String = null,
    position: PositionType = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    status: StatusIndicator = null,
    value: String = null,
    width: Double | String = null
  ): CardProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.get.asInstanceOf[js.Any])
    if (cardType != null) __obj.updateDynamic("cardType")(cardType.asInstanceOf[js.Any])
    if (descriptions != null) __obj.updateDynamic("descriptions")(descriptions.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProperties]
  }
}

