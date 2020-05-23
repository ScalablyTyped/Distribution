package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemLayout extends js.Object {
  var componentHeight: js.UndefOr[Double | String] = js.undefined
  var componentWidth: js.UndefOr[Double | String] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var titleFontSize: js.UndefOr[Double | String] = js.undefined
}

object FormItemLayout {
  @scala.inline
  def apply(
    componentHeight: Double | String = null,
    componentWidth: Double | String = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    info: String = null,
    titleFontSize: Double | String = null
  ): FormItemLayout = {
    val __obj = js.Dynamic.literal()
    if (componentHeight != null) __obj.updateDynamic("componentHeight")(componentHeight.asInstanceOf[js.Any])
    if (componentWidth != null) __obj.updateDynamic("componentWidth")(componentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLayout]
  }
}

