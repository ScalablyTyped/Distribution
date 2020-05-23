package typings.dayjs.objectSupportMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def add(argument: js.Object): Dayjs
  def set(argument: js.Object): Dayjs
  def subtract(argument: js.Object): Dayjs
}

object Dayjs {
  @scala.inline
  def apply(add: js.Object => Dayjs, set: js.Object => Dayjs, subtract: js.Object => Dayjs): Dayjs = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), set = js.Any.fromFunction1(set), subtract = js.Any.fromFunction1(subtract))
    __obj.asInstanceOf[Dayjs]
  }
}

