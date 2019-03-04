package typings
package datejsLib.sugarpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLiteral extends js.Object {
  var hour: scala.Double
  var millisecond: scala.Double
  var minute: scala.Double
  var second: scala.Double
}

object ITimeLiteral {
  @scala.inline
  def apply(hour: scala.Double, millisecond: scala.Double, minute: scala.Double, second: scala.Double): ITimeLiteral = {
    val __obj = js.Dynamic.literal(hour = hour, millisecond = millisecond, minute = minute, second = second)
  
    __obj.asInstanceOf[ITimeLiteral]
  }
}

