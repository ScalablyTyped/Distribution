package typings.dayjs.dayOfYearMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def dayOfYear(): Double
}

object Dayjs {
  @scala.inline
  def apply(dayOfYear: () => Double): Dayjs = {
    val __obj = js.Dynamic.literal(dayOfYear = js.Any.fromFunction0(dayOfYear))
  
    __obj.asInstanceOf[Dayjs]
  }
}

