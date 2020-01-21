package typings.dayjs.toObjectMod.dayjsAugmentingMod

import typings.dayjs.toObjectMod.DayjsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def toObject(): DayjsObject
}

object Dayjs {
  @scala.inline
  def apply(toObject: () => DayjsObject): Dayjs = {
    val __obj = js.Dynamic.literal(toObject = js.Any.fromFunction0(toObject))
  
    __obj.asInstanceOf[Dayjs]
  }
}

