package typings.bizcharts

import typings.bizcharts.mod.GeomAdjustType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDodgeBy extends js.Object {
  var dodgeBy: js.UndefOr[String] = js.undefined
  var marginRatio: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[GeomAdjustType] = js.undefined
}

object AnonDodgeBy {
  @scala.inline
  def apply(dodgeBy: String = null, marginRatio: Int | Double = null, `type`: GeomAdjustType = null): AnonDodgeBy = {
    val __obj = js.Dynamic.literal()
    if (dodgeBy != null) __obj.updateDynamic("dodgeBy")(dodgeBy.asInstanceOf[js.Any])
    if (marginRatio != null) __obj.updateDynamic("marginRatio")(marginRatio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDodgeBy]
  }
}

