package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormLayout extends js.Object {
  var height: js.UndefOr[Double | String] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object FormLayout {
  @scala.inline
  def apply(height: Double | String = null, padding: String = null, width: Double | String = null): FormLayout = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormLayout]
  }
}

