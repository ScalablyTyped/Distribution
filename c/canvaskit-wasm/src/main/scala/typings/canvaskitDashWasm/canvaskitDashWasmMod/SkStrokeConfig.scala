package typings.canvaskitDashWasm.canvaskitDashWasmMod

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
    miter_limit: Int | Double = null,
    precision: Int | Double = null,
    width: Int | Double = null
  ): SkStrokeConfig = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (miter_limit != null) __obj.updateDynamic("miter_limit")(miter_limit.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkStrokeConfig]
  }
}

