package typings.dayjs.isTodayMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isToday(): Boolean
}

object Dayjs {
  @scala.inline
  def apply(isToday: () => Boolean): Dayjs = {
    val __obj = js.Dynamic.literal(isToday = js.Any.fromFunction0(isToday))
    __obj.asInstanceOf[Dayjs]
  }
}

