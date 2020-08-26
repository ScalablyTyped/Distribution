package typings.dayjs.isLeapYearMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dayjs extends js.Object {
  def isLeapYear(): Boolean = js.native
}

object Dayjs {
  @scala.inline
  def apply(isLeapYear: () => Boolean): Dayjs = {
    val __obj = js.Dynamic.literal(isLeapYear = js.Any.fromFunction0(isLeapYear))
    __obj.asInstanceOf[Dayjs]
  }
  @scala.inline
  implicit class DayjsOps[Self <: Dayjs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsLeapYear(value: () => Boolean): Self = this.set("isLeapYear", js.Any.fromFunction0(value))
  }
  
}

