package typings.baiduApp.swan

import typings.baiduApp.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEvent[T /* <: TouchEventType */] extends BaseEvent[T, X] {
  var changedTouches: js.Array[Touch]
  var touches: js.Array[Touch]
}

object TouchEvent {
  @scala.inline
  def apply[T](
    changedTouches: js.Array[Touch],
    currentTarget: EventTarget,
    detail: X,
    target: EventTarget,
    timeStamp: Double,
    touches: js.Array[Touch],
    `type`: T
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent[T]]
  }
}

