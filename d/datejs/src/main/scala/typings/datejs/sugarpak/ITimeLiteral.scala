package typings.datejs.sugarpak

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLiteral extends js.Object {
  var hour: Double
  var millisecond: Double
  var minute: Double
  var second: Double
}

object ITimeLiteral {
  @scala.inline
  def apply(hour: Double, millisecond: Double, minute: Double, second: Double): ITimeLiteral = {
    val __obj = js.Dynamic.literal(hour = hour, millisecond = millisecond, minute = minute, second = second)
  
    __obj.asInstanceOf[ITimeLiteral]
  }
}

