package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProperties extends ComponentProperties {
  /**
    * The content inside the text editor
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * The languge mode for this text editor. The language mode is SQL by default.
    */
  var languageMode: js.UndefOr[String] = js.undefined
  /**
    * Minimum height for editor component
    */
  var minimumHeight: js.UndefOr[Double] = js.undefined
}

object EditorProperties {
  @scala.inline
  def apply(
    CSSStyles: StringDictionary[String] = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    languageMode: String = null,
    minimumHeight: js.UndefOr[Double] = js.undefined,
    position: PositionType = null,
    width: Double | String = null
  ): EditorProperties = {
    val __obj = js.Dynamic.literal()
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (languageMode != null) __obj.updateDynamic("languageMode")(languageMode.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumHeight)) __obj.updateDynamic("minimumHeight")(minimumHeight.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorProperties]
  }
}

