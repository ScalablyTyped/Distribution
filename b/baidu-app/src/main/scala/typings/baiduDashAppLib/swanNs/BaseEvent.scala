package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[T /* <: java.lang.String */, Detail] extends js.Object {
  var currentTarget: EventTarget
  var detail: Detail
  var target: EventTarget
  var timeStamp: scala.Double
  var `type`: T
}

object BaseEvent {
  @scala.inline
  def apply[T /* <: java.lang.String */, Detail](
    currentTarget: EventTarget,
    detail: Detail,
    target: EventTarget,
    timeStamp: scala.Double,
    `type`: T
  ): BaseEvent[T, Detail] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[BaseEvent[T, Detail]]
  }
}

