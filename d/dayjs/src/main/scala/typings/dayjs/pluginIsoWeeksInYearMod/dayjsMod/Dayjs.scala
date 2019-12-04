package typings.dayjs.pluginIsoWeeksInYearMod.dayjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isoWeeksInYear(): Double
}

object Dayjs {
  @scala.inline
  def apply(isoWeeksInYear: () => Double): Dayjs = {
    val __obj = js.Dynamic.literal(isoWeeksInYear = js.Any.fromFunction0(isoWeeksInYear))
  
    __obj.asInstanceOf[Dayjs]
  }
}

