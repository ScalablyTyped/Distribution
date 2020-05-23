package typings.azdata.mod

import typings.azdata.anon.Dark
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentWithIcon extends js.Object {
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconHeight: js.UndefOr[Double | String] = js.undefined
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconPath: js.UndefOr[String | Uri | Dark] = js.undefined
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconWidth: js.UndefOr[Double | String] = js.undefined
}

object ComponentWithIcon {
  @scala.inline
  def apply(
    iconHeight: Double | String = null,
    iconPath: String | Uri | Dark = null,
    iconWidth: Double | String = null
  ): ComponentWithIcon = {
    val __obj = js.Dynamic.literal()
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentWithIcon]
  }
}

