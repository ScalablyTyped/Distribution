package typings.dayjs.toArrayMod.dayjsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def toArray(): js.Array[Double]
}

object Dayjs {
  @scala.inline
  def apply(toArray: () => js.Array[Double]): Dayjs = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[Dayjs]
  }
}

