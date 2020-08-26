package typings.dayjs.objectSupportMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dayjs extends js.Object {
  def add(argument: js.Object): Dayjs = js.native
  def set(argument: js.Object): Dayjs = js.native
  def subtract(argument: js.Object): Dayjs = js.native
}

object Dayjs {
  @scala.inline
  def apply(add: js.Object => Dayjs, set: js.Object => Dayjs, subtract: js.Object => Dayjs): Dayjs = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), set = js.Any.fromFunction1(set), subtract = js.Any.fromFunction1(subtract))
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
    def setAdd(value: js.Object => Dayjs): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: js.Object => Dayjs): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setSubtract(value: js.Object => Dayjs): Self = this.set("subtract", js.Any.fromFunction1(value))
  }
  
}

