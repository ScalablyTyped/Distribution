package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkStrokeConfig extends js.Object {
  var cap: js.UndefOr[SkStrokeCap] = js.undefined
  var join: js.UndefOr[SkStrokeJoin] = js.undefined
  var miter_limit: js.UndefOr[Double] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SkStrokeConfig {
  @scala.inline
  def apply(
    cap: SkStrokeCap = null,
    join: SkStrokeJoin = null,
    miter_limit: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SkStrokeConfig = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (!js.isUndefined(miter_limit)) __obj.updateDynamic("miter_limit")(miter_limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkStrokeConfig]
  }
}

