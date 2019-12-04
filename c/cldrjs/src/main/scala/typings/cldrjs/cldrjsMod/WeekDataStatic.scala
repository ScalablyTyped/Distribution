package typings.cldrjs.cldrjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekDataStatic extends js.Object {
  def firstDay(): String
  def minDays(): Double
}

object WeekDataStatic {
  @scala.inline
  def apply(firstDay: () => String, minDays: () => Double): WeekDataStatic = {
    val __obj = js.Dynamic.literal(firstDay = js.Any.fromFunction0(firstDay), minDays = js.Any.fromFunction0(minDays))
  
    __obj.asInstanceOf[WeekDataStatic]
  }
}

