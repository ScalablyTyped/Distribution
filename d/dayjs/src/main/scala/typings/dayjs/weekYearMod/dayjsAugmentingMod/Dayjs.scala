package typings.dayjs.weekYearMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dayjs extends js.Object {
  def weekYear(): Double = js.native
}

object Dayjs {
  @scala.inline
  def apply(weekYear: () => Double): Dayjs = {
    val __obj = js.Dynamic.literal(weekYear = js.Any.fromFunction0(weekYear))
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
    def setWeekYear(value: () => Double): Self = this.set("weekYear", js.Any.fromFunction0(value))
  }
  
}

