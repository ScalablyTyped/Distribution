package typings.dayjs.isTomorrowMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def isTomorrow(): Boolean
}

object Dayjs {
  @scala.inline
  def apply(isTomorrow: () => Boolean): Dayjs = {
    val __obj = js.Dynamic.literal(isTomorrow = js.Any.fromFunction0(isTomorrow))
    __obj.asInstanceOf[Dayjs]
  }
}

