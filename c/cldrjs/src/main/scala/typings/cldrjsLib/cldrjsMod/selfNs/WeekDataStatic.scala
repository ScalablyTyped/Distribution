package typings
package cldrjsLib.cldrjsMod.selfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekDataStatic extends js.Object {
  def firstDay(): java.lang.String
  def minDays(): scala.Double
}

object WeekDataStatic {
  @scala.inline
  def apply(firstDay: js.Function0[java.lang.String], minDays: js.Function0[scala.Double]): WeekDataStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstDay")(firstDay)
    __obj.updateDynamic("minDays")(minDays)
    __obj.asInstanceOf[WeekDataStatic]
  }
}

