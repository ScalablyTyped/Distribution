package typings.dayjs.isYesterdayMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dayjs extends js.Object {
  def isYesterday(): Boolean = js.native
}

object Dayjs {
  @scala.inline
  def apply(isYesterday: () => Boolean): Dayjs = {
    val __obj = js.Dynamic.literal(isYesterday = js.Any.fromFunction0(isYesterday))
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
    def setIsYesterday(value: () => Boolean): Self = this.set("isYesterday", js.Any.fromFunction0(value))
  }
  
}

