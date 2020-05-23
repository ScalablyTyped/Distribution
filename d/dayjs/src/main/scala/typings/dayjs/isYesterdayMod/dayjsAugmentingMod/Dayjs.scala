package typings.dayjs.isYesterdayMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isYesterday(): Boolean
}

object Dayjs {
  @scala.inline
  def apply(isYesterday: () => Boolean): Dayjs = {
    val __obj = js.Dynamic.literal(isYesterday = js.Any.fromFunction0(isYesterday))
    __obj.asInstanceOf[Dayjs]
  }
}

