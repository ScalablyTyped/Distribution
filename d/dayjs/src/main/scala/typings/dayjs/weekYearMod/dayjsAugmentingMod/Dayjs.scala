package typings.dayjs.weekYearMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def weekYear(): Double
}

object Dayjs {
  @scala.inline
  def apply(weekYear: () => Double): Dayjs = {
    val __obj = js.Dynamic.literal(weekYear = js.Any.fromFunction0(weekYear))
  
    __obj.asInstanceOf[Dayjs]
  }
}

