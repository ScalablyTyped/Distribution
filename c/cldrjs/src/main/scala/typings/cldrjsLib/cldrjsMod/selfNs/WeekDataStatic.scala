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
  def apply(firstDay: () => java.lang.String, minDays: () => scala.Double): WeekDataStatic = {
    val __obj = js.Dynamic.literal(firstDay = js.Any.fromFunction0(firstDay), minDays = js.Any.fromFunction0(minDays))
  
    __obj.asInstanceOf[WeekDataStatic]
  }
}

