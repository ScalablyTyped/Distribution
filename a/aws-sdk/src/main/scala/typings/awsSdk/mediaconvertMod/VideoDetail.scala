package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoDetail extends js.Object {
  /**
    * Height in pixels for the output
    */
  var HeightInPx: js.UndefOr[integer] = js.native
  /**
    * Width in pixels for the output
    */
  var WidthInPx: js.UndefOr[integer] = js.native
}

object VideoDetail {
  @scala.inline
  def apply(HeightInPx: js.UndefOr[integer] = js.undefined, WidthInPx: js.UndefOr[integer] = js.undefined): VideoDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HeightInPx)) __obj.updateDynamic("HeightInPx")(HeightInPx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WidthInPx)) __obj.updateDynamic("WidthInPx")(WidthInPx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDetail]
  }
}

