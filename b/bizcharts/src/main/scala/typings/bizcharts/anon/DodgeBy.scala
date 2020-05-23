package typings.bizcharts.anon

import typings.bizcharts.mod.GeomAdjustType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DodgeBy extends js.Object {
  var dodgeBy: js.UndefOr[String] = js.undefined
  var marginRatio: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[GeomAdjustType] = js.undefined
}

object DodgeBy {
  @scala.inline
  def apply(
    dodgeBy: String = null,
    marginRatio: js.UndefOr[Double] = js.undefined,
    `type`: GeomAdjustType = null
  ): DodgeBy = {
    val __obj = js.Dynamic.literal()
    if (dodgeBy != null) __obj.updateDynamic("dodgeBy")(dodgeBy.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRatio)) __obj.updateDynamic("marginRatio")(marginRatio.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DodgeBy]
  }
}

