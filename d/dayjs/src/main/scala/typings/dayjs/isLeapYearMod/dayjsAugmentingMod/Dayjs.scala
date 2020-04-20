package typings.dayjs.isLeapYearMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isLeapYear(): Boolean
}

object Dayjs {
  @scala.inline
  def apply(isLeapYear: () => Boolean): Dayjs = {
    val __obj = js.Dynamic.literal(isLeapYear = js.Any.fromFunction0(isLeapYear))
    __obj.asInstanceOf[Dayjs]
  }
}

