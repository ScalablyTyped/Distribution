package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeInfo extends js.Object {
  /**
    * A boolean value indicating if the resize operation can be cancelled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.native
  /**
    * Returns the value ClassicResize.
    */
  var ResizeType: js.UndefOr[String] = js.native
}

object ResizeInfo {
  @scala.inline
  def apply(AllowCancelResize: js.UndefOr[scala.Boolean] = js.undefined, ResizeType: String = null): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowCancelResize)) __obj.updateDynamic("AllowCancelResize")(AllowCancelResize.asInstanceOf[js.Any])
    if (ResizeType != null) __obj.updateDynamic("ResizeType")(ResizeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeInfo]
  }
}

