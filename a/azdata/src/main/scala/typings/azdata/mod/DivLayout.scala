package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivLayout extends js.Object {
  /**
  		 * Container Height
  		 */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
  		 * Container Width
  		 */
  var width: js.UndefOr[Double | String] = js.undefined
}

object DivLayout {
  @scala.inline
  def apply(height: Double | String = null, width: Double | String = null): DivLayout = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivLayout]
  }
}

