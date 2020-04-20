package typings.blueprintjsCore.overflowListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowListState[T] extends js.Object {
  /** Length of last overflow to dedupe `onOverflow` calls during smooth resizing. */
  var lastOverflowCount: Double
  var overflow: js.Array[T]
  var visible: js.Array[T]
}

object IOverflowListState {
  @scala.inline
  def apply[T](lastOverflowCount: Double, overflow: js.Array[T], visible: js.Array[T]): IOverflowListState[T] = {
    val __obj = js.Dynamic.literal(lastOverflowCount = lastOverflowCount.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowListState[T]]
  }
}

