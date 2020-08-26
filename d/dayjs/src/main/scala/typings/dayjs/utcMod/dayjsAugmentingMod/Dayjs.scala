package typings.dayjs.utcMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dayjs extends js.Object {
  def isUTC(): Boolean = js.native
  def local(): Dayjs = js.native
  def utc(): Dayjs = js.native
  def utcOffset(offset: Double): Dayjs = js.native
}

object Dayjs {
  @scala.inline
  def apply(isUTC: () => Boolean, local: () => Dayjs, utc: () => Dayjs, utcOffset: Double => Dayjs): Dayjs = {
    val __obj = js.Dynamic.literal(isUTC = js.Any.fromFunction0(isUTC), local = js.Any.fromFunction0(local), utc = js.Any.fromFunction0(utc), utcOffset = js.Any.fromFunction1(utcOffset))
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
    def setIsUTC(value: () => Boolean): Self = this.set("isUTC", js.Any.fromFunction0(value))
    @scala.inline
    def setLocal(value: () => Dayjs): Self = this.set("local", js.Any.fromFunction0(value))
    @scala.inline
    def setUtc(value: () => Dayjs): Self = this.set("utc", js.Any.fromFunction0(value))
    @scala.inline
    def setUtcOffset(value: Double => Dayjs): Self = this.set("utcOffset", js.Any.fromFunction1(value))
  }
  
}

