package typings.bizcharts

import typings.bizcharts.bizchartsMod.GeomAdjustType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DodgeBy extends js.Object {
  var dodgeBy: js.UndefOr[String] = js.undefined
  var marginRatio: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[GeomAdjustType] = js.undefined
}

object Anon_DodgeBy {
  @scala.inline
  def apply(dodgeBy: String = null, marginRatio: Int | Double = null, `type`: GeomAdjustType = null): Anon_DodgeBy = {
    val __obj = js.Dynamic.literal()
    if (dodgeBy != null) __obj.updateDynamic("dodgeBy")(dodgeBy.asInstanceOf[js.Any])
    if (marginRatio != null) __obj.updateDynamic("marginRatio")(marginRatio.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DodgeBy]
  }
}

