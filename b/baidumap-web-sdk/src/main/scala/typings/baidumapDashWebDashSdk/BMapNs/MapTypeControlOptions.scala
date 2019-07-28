package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeControlOptions extends js.Object {
  var mapTypes: js.UndefOr[js.Array[MapType]] = js.undefined
  var `type`: js.UndefOr[MapTypeControlType] = js.undefined
}

object MapTypeControlOptions {
  @scala.inline
  def apply(mapTypes: js.Array[MapType] = null, `type`: js.UndefOr[MapTypeControlType] = js.undefined): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    if (mapTypes != null) __obj.updateDynamic("mapTypes")(mapTypes)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapTypeControlOptions]
  }
}

